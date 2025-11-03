import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBalloon extends Balloon
{
    
    
    public RedBalloon(){
        HP = 1;
        speed = 4;
        weightValue = 1;
        drawImage();
    }
    
    public void drawImage(){
        image = new GreenfootImage("RedBalloon.png");
        setImage(image);
    }
    
    public void act()
    {
        super.act();
        
        
    }
    
}
