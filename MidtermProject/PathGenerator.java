import java.util.*;
import greenfoot.*;


/**
 * Path Generator Helper Class that helps generate the path with UI and points
 * 
 * @author Max 
 * @version (a version number or a date)
 */
public class PathGenerator extends Actor
{
    
    private ArrayList<Coordinate> pathPoints = new ArrayList<>();
    
    private GreenfootImage pathImage;
    
    private final int circleRadius = 20;
    
    public PathGenerator(ArrayList<Coordinate> pathPoints, int worldWidth, int worldHeight){
        this.pathPoints = pathPoints;
        pathImage = new GreenfootImage(worldWidth, worldHeight);
    }
    
    public void drawPathPoints(){
        System.out.println("----------");
        for (int i = 0; i < pathPoints.size(); i++){
        
            Coordinate currentPathCoordinate = pathPoints.get(i);
            int currentX = currentPathCoordinate.getX();
            int currentY = currentPathCoordinate.getY();
            //pathImage.setColor(Color.RED);
            //pathImage.fillOval(currentX + (10/2), currentY + (10/2), 10, 10);
            drawCircleCentered(circleRadius, currentX, currentY, pathImage);
            if (i != 0){
                Coordinate pastPathCoordinate = pathPoints.get(i - 1);
                int pastX = pastPathCoordinate.getX();
                int pastY = pastPathCoordinate.getY();
                drawLineCentered(pastX, pastY, currentX, currentY, circleRadius, pathImage);
            }
        }
        
    }
    
    public GreenfootImage getImage(){
        return pathImage;
    }
    
    /**
     * Draws a circle, centered for the parameter inputs, (x,y)
     * created bc greenfoot draws it in upper left coordinate which is not good
     */
    private void drawCircleCentered(int radius, int x, int y, GreenfootImage image){
        image.setColor(Color.RED);
        image.fillOval(x + (radius/2), y + (radius/2), radius, radius);
    }
    
    private void drawLineCentered(int x1, int y1, int x2, int y2, int radius, GreenfootImage image){
        image.setColor(Color.BLACK);
        image.drawLine(x1 + radius, y1 + radius, x2 + radius, y2 + radius);
    }
    
    public Coordinate getPathPoint(int index){
        return pathPoints.get(index);
    }
    
    public ArrayList<Coordinate> getPathArray(){
        return pathPoints;
    }
}