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
    private ArrayList<Coordinate> pathPoints = new ArrayList<>();
    private PathGenerator pathGenerator;
    private GreenfootImage background; 

 
    protected static int maxHealth;
    protected final Color healthColor = new Color(0, 128, 0);
    protected final Color missingColor = new Color(210, 100, 102);
    protected final Color borderColor = new Color(101, 67, 33);

     
    public MyWorld()
    {   
        super(1200, 800, 1); 
        

        addPathPoints();
    
        addObject(new PathGenerator(pathPoints, this.getWidth(), this.getHeight()), getWidth() / 2, getHeight() / 2);
       
        addObject(new SuperStatBar(100, 100, null, 300, 20, 0, healthColor, missingColor, false, borderColor, 3), 425, 20);

    }
    
    public void act(){
        
    }
    
    private void addPathPoints(){
        pathPoints.add(new Coordinate(100, 100));
        pathPoints.add(new Coordinate(200, 100));
        pathPoints.add(new Coordinate(200, 200));
        pathPoints.add(new Coordinate(400, 200));
        pathPoints.add(new Coordinate(500, 200));
        pathPoints.add(new Coordinate(500, 400));
        pathPoints.add(new Coordinate(700, 400));
        pathPoints.add(new Coordinate(700, 500));
        pathPoints.add(new Coordinate(700, 600));
        pathPoints.add(new Coordinate(600, 600));
        pathPoints.add(new Coordinate(500, 600));
        pathPoints.add(new Coordinate(500, 700));
        //pathPoints.add(new Coordinate(500, 700));
    }
}


