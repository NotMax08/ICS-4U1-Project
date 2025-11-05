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
     
    public MyWorld()
    {   
        super(600, 400, 1); 
        addPathPoints();
        pathGenerator = new PathGenerator(pathPoints, this.getWidth(), this.getWidth());
        pathGenerator.drawPathPoints();
        
        background = new GreenfootImage (pathGenerator.getImage());
        setBackground(background);
        
        this.addObject(new SuperStatBar(100, 100, null, 300, 50, 0, Color.GREEN, Color.RED, false, Color.BLACK, 5), 300, 400);
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
