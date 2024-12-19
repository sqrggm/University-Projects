import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy_Standard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy_Standard extends Actor
{
    public Enemy_Standard() {
    setImage("PC Computer - Touhou Seirensen Undefined Fantastic Object - Enemies.png");
    }
    public void act()
    {
        setLocation(getX(), getY() + 2);
        
        if(isAtEdge()){
            getWorld().removeObject(this); 
        }
    }
    
    public void destroy()
    {
    World world = getWorld();
    if (world instanceof Normal_Mode)
    {
    ((Normal_Mode)world).enemyDestroyed();
    }
    world.removeObject(this);
    }
}


