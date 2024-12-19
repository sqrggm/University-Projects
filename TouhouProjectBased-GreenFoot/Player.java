import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int cooldownTime;
    private int cooldownCounter;
    public int life;
    private int invicibiltyTimer;
    private static final int INVINCIBILITY_DURATION = 120;
    public int enemiesDestroyed;
    private GreenfootSound playerMusic;
    
    public Player() {cooldownTime = 2;
                    cooldownCounter = 0;
                    life = 3;
                    invicibiltyTimer = 0;
                    enemiesDestroyed = 0;
                    
                    playerMusic = new GreenfootSound("NormalMode.mp3");
                    startMusic();
    }
    
    
    
    public void act()
    {
    if (cooldownCounter > 0) {
        cooldownCounter--;
    }
    
    
    
    if (Greenfoot.isKeyDown("up")){
        moveUp();
    }
    if (Greenfoot.isKeyDown("down")){
        moveDown();
    }
    if (Greenfoot.isKeyDown("left")){
        moveLeft();
    }
    if (Greenfoot.isKeyDown("Right")){
    moveRight();
    }
    if (Greenfoot.isKeyDown("x") && cooldownCounter == 0){
        atirar();
        cooldownCounter = cooldownTime;
    }
    if (invicibiltyTimer > 0){
    invicibiltyTimer--;
    }
    
    checkCollisionWithEnemies();
}

    public void moveUp() {
    int x = getX();
    int y = getY();
    setLocation(x, y - 3); // Moves o objeto 3 pixels para cima
    }
    
    public void moveDown(){
    int x = getX();
    int y = getY();
    setLocation(x, y + 3);
    }

    public void moveLeft(){
    
    move(-3);
    }
    public void moveRight(){
    move(3);
    }
    
    public void atirar(){
    Projectile projetil = new Projectile();
    getWorld().addObject(projetil, getX(), getY());
    }
    
    public int getLife(){
    return life;
    }
    public int getEnemiesDestroyes(){
    return enemiesDestroyed;
    }
    public void loseLife() {
        if (invicibiltyTimer == 0){
        life--; 
        invicibiltyTimer = INVINCIBILITY_DURATION;
        if (life <= 0) { 
            stopMusic();
            getWorld().removeObject(this);
            World world = getWorld();
            Greenfoot.setWorld(new game_over());
        }
            
        }
    
    }  
    public boolean isInvincible()
    { 
    return invicibiltyTimer > 0;
    }
    
    private void checkCollisionWithEnemies(){
    Actor enemy = getOneIntersectingObject(Enemy_Standard.class); 
    if (enemy == null) 
    { 
        enemy = getOneIntersectingObject(Enemy_Shooter.class); 
    }
    if (enemy != null && !isInvincible())
    {
        loseLife();
    if (enemy instanceof Enemy_Shooter)
    {
        ((Enemy_Standard)enemy).destroy();
    }
    else if (enemy instanceof Enemy_Shooter){
    ((Enemy_Shooter)enemy).destroy();
    }
    }
    }
    public void startMusic(){
    if (!playerMusic.isPlaying()){
    playerMusic.playLoop();
    }
    
    
    }
    public void stopMusic(){
    if (playerMusic.isPlaying()){
    playerMusic.stop();
    }
}
}

