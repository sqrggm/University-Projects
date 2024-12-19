import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuidedProjectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuidedProjectile extends Actor
{
   private int targetX; 
   private int targetY;
    
   
   public GuidedProjectile(int targetX, int targetY){
    this.targetX = targetX;
    this.targetY = targetY;
    turnTowards(targetX,targetY);
    }
    
   
    public void act()
    {
    move(4);
    
    checkCollision();
    
    if (isAtEdge()){
        getWorld().removeObject(this);
    }
}
    private void checkCollision(){
        Player player = (Player) getOneIntersectingObject(Player.class);
            if (player != null)
            {
            if (!player.isInvincible())
            {
            player.loseLife();
        }
            
        }
        }
    
    
    
}
