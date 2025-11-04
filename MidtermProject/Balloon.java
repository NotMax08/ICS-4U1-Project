import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  This is a superclass for the enemy which are balloons
 *  Balloons float across the path and try to reach the end of the path
 *  Balloons vary by colour, health, speed, states
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
    protected int actCount; //counts how long the balloon has lived
    
    // special balloon states 
    protected boolean camo; 
    protected boolean lead;
    
    
    public Balloon(){
        
    }
    
    public void act(){
        actCount++;
        move();
    }
    
    public void move(){
        move(speed);
    }
    
    public int getActCount(){
        return actCount;
    }
    
    /**
     *  Methods to get the state of the ballooon
     */
    public boolean isCamo(){
        return camo;
    }
    public boolean isLead(){
        return lead;
    }
    
    public void removeMe(){
        getWorld().removeObject(this);
    }
    
}
