import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenBalloon here.
 * 
 * @author Robin Liu
 * @version Nov 4
 */
public class GreenBalloon extends Balloon
{
    
    
    public GreenBalloon(){
        HP = 5;
        speed = 5;
        weightValue = 3;
        drawImage();
    }
    
    public void act()
    {
        super.act();
    }
    
    public void drawImage(){
        image = new GreenfootImage("GreenBalloon.png");
        image.scale(40,30);
        setImage(image);
    }
}
