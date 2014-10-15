import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

/**
 * This class creates the building given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Building 
{
    /** the x coordinate of the building*/
    private int xLeft; 
    /** the y coordinate of the building*/
    private int yTop; 
    /** the height of the building*/
    private int height; 
    /** the width of the building*/
    private int width; 

     /**
     * constructor for the objects of the class building
     * @param xLeft = x coordinate of the building
     * @param yTop = y coordinate of the building
     * @param width = width of the building
     * @param height = height of the building
     */
    public Building(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the building
     * @param g2 this the window that the building is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle building = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.BLACK); 
        g2.draw(building); 
        g2.fill(building); 
    } 
}
