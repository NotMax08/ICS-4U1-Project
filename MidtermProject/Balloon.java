import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  This is a superclass for the enemy which are balloons
 *  Balloons float across the path and try to reach the end of the path
 *  Balloons vary by colour, health, speed
 * 
 * @author Robin Liu 
 * @version Nov 3
 */
public abstract class Balloon extends SuperSmoothMover
{
    protected int HP; 
    protected double speed; 
    protected int weightValue; //how heavy the balloon is ?
    protected GreenfootImage image;
    protected int actCount; //counts
    protected boolean isCamo;
    protected boolean isLead;
    
    
    public Balloon(){
        
    }
    
    public void act(){
        actCount++;
        move();
    }
    
    public void move(){
        
    }
    
    public int getActCount(){
        return actCount;
    }
}
