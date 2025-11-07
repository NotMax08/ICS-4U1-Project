import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  This is a superclass for the enemy which are balloons
 *  Balloons float across the path and try to reach the end of the path
 *  Balloons vary by colour, health, speed, states
 * 
 *  Art Credits:
 *  Red Balloon - PNG Tree
 *  Pop Image - @Color Optimist on OpenGameArt.org
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
    protected final static GreenfootImage popImage = new GreenfootImage("popImage.png");
    protected boolean popped;
    protected int actCount; //counts how long the balloon has lived
    protected final int IMAGE_WIDTH = 40;
    protected final int IMAGE_HEIGHT = 60;

    // special balloon states 
    protected boolean camo; 
    protected boolean lead;

    public Balloon(){
        enableStaticRotation();
        popImage.scale(50,50);
        popped = false;
    }

    public void act(){
        actCount++;
        if(popped){
            if(actCount == actCount + 20){
                removeMe();
            }else{
                popMe();
            }
        }else{
            move();
        }
    }

    public void move(){
        
        //move(speed);
    }

    public int getActCount(){
        return actCount;
    }

    /**
     *  Method to damage the balloon
     */
    public void damageMe(int damage){
        if(HP - damage <= 0){
            popped = true;
            //pop sound;
        }else{
            this.HP = HP - damage;
        }
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

    public void popMe(){
        setImage(popImage);
    }
    
    public boolean isPopped(){
        return popped;
    }

}
