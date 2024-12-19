import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(270); // Define a direção do projétil para cima }
        move(10);
        if (isAtEdge()){
        getWorld().removeObject(this);
    }
    else{
        checkCollision();
    }
    }
    private void checkCollision(){{
    Enemy_Standard enemyStandard = (Enemy_Standard) getOneIntersectingObject(Enemy_Standard.class); 
    if (enemyStandard != null)
    { 
        enemyStandard.destroy();
        getWorld().removeObject(enemyStandard); 
        getWorld().removeObject(this); 
        return; 
    }
    }
    Enemy_Shooter enemyShooter = (Enemy_Shooter) getOneIntersectingObject(Enemy_Shooter.class); 
    if (enemyShooter != null) 
    { 
        enemyShooter.destroy();
        getWorld().removeObject(enemyShooter);  
        getWorld().removeObject(this);
        return;
    }
    
    }
    
}
