import greenfoot.*;  
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    ArrayList<Coordinate> pathPoints = new ArrayList<>();
    PathGenerator pathGenerator;
    GreenfootImage background; 
    
    protected static int maxHealth;
    protected final Color healthColor = new Color(0, 128, 0);
    protected final Color missingColor = new Color(210, 100, 102);
    protected final Color borderColor = new Color(101, 67, 33);
     
    public MyWorld()
    {   
        super(600, 400, 1); 
        addPathPoints();
        pathGenerator = new PathGenerator(pathPoints, this.getWidth(), this.getWidth());
        pathGenerator.drawPathPoints();
        
        background = new GreenfootImage (pathGenerator.getImage());
        setBackground(background);
        
        addObject(new SuperStatBar(100, 100, null, 300, 20, 0, healthColor, missingColor, false, borderColor, 3), 425, 20);
    }
    public void act(){
        
    }
    
    private void addPathPoints(){
        pathPoints.add(new Coordinate(100, 100));
        pathPoints.add(new Coordinate(200, 100));
        pathPoints.add(new Coordinate(200, 200));
        pathPoints.add(new Coordinate(200, 300));
        pathPoints.add(new Coordinate(300, 300));
        pathPoints.add(new Coordinate(400, 300));
    }
}
