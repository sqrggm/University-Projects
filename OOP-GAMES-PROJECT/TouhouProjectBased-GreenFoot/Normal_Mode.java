import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Normal_Mode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal_Mode extends World
{
    private GreenfootImage bgImage;
    private int scrollPosition;
    private int enemySpawnTimer; 
    private int shooterSpawnTimer;
    private Random random;
    public int enemiesDestroyed;
    private Player player;

    
    
    
    public Normal_Mode()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Player(); 
        addObject(player, getWidth() / 2, getHeight() - 50);
        bgImage = new GreenfootImage("92016.png");
        bgImage.scale(getWidth(), getHeight());
        scrollPosition = 0;
        setBackground(new GreenfootImage(getWidth(), getHeight()));
        drawBackground();
        random = new Random(); 
        enemySpawnTimer = 0;
        shooterSpawnTimer = 0;
        enemiesDestroyed = 0;
        updateHUD();
        
    }
    public void act(){
    scrollBackground();
    spawnEnemy();
    SpawnShooterEnemy();
    updateHUD();
    if (player == null || !getObjects(Player.class).contains(player)){
    
    Greenfoot.setWorld(new game_over());
    }
    
    }
    private void scrollBackground() {
    scrollPosition += 1;
    if (scrollPosition >= bgImage.getHeight()){
        scrollPosition = 0;
    }
    drawBackground();
    }
    private void drawBackground() { 
        GreenfootImage bg = getBackground();
        bg.drawImage(bgImage, 0, scrollPosition - bgImage.getHeight());
        bg.drawImage(bgImage, 0, scrollPosition);
    }
    private void spawnEnemy() {
    enemySpawnTimer++;
    if (enemySpawnTimer >= 100) {
        int x = random.nextInt(getWidth());
        addObject(new Enemy_Standard(), x, 0);
        
        enemySpawnTimer = 0;
    }
    }
    private void SpawnShooterEnemy() { 
        shooterSpawnTimer++; if (shooterSpawnTimer >= 300) { 
            int x = random.nextInt(getWidth());
            addObject(new Enemy_Shooter(), x, 0);
            shooterSpawnTimer = 0;
        }
    }
    public void enemyDestroyed(){
    enemiesDestroyed++;
    updateHUD();
    }
    
    private void updateHUD(){
    showText("Inimigos Destruidos: " + enemiesDestroyed, 120,15);
    showText("Vida: " + player.life, getWidth() - 60,15);
    }
    public int getEnemiesDestroyed(){
    return enemiesDestroyed;
    }
    
            
}
