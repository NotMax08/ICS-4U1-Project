import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Balloon extends SuperSmoothMover
{
    protected int HP;
    protected double speed;
    protected int weightValue;
    protected GreenfootImage image;
    
    
    public Balloon(){
        
    }
    
    public void act(){
        move();
    }
    
    public void move(){
        
    }
}
