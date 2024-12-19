import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Enemy_Shooter extends Enemy_Standard
{
    private int shootTimer;
    
    public Enemy_Shooter(){
    setImage("Enemy_Shooter.png");
    shootTimer = 0;
    }
    public void act()
    {
        setLocation(getX(), getY() + 2);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    
    
        shootTimer++;
        if (shootTimer >=100){
        shootAtPlayer();
        shootTimer = 0;
        }
    }
    
    private void shootAtPlayer(){
        World world = getWorld();
        if (world == null)
        {
        return;
        }
        List<Player> players = world.getObjects(Player.class);
        if (players != null && !players.isEmpty())
        {
            Player player = players.get(0);
            int playerX = player.getX();
            int playerY = player.getY();
            GuidedProjectile projectile = new GuidedProjectile(playerX,playerY);
            world.addObject(projectile,getX(),getY());
            projectile.turnTowards(playerX,playerY);
        }
    }
    public void destroy(){
    World world = getWorld();
    ((Normal_Mode)world).enemyDestroyed();
    world.removeObject(this);
    }
}
