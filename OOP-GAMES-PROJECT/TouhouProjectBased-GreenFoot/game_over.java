import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class game_over extends World
{
    private GreenfootSound gameOverMusic;    
    
    public game_over()
    {    
        super(600, 400, 1);
        gameOverMusic = new GreenfootSound("GameOver.mp3");
        startMusic();

    }
    
    private void startMusic(){
    if (!gameOverMusic.isPlaying()){
    gameOverMusic.play();
    }
    }
    
    private void stopMusic(){
    if (gameOverMusic.isPlaying()){
    gameOverMusic.stop();
    }
    
    }
    
    public void stopped(){
    stopMusic();
    }
    
}


