import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

/**
 * This class creates the door given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Door 
{
    /** the x coordinate of the door*/
    private int xLeft; 
    /** the y coordinate of the door*/
    private int yTop; 
    /** the height of the door*/
    private int height; 
    /** the width of the door*/
    private int width; 

    /**
     * constructor for the objects of the class door
     * @param xLeft = x coordinate of the door
     * @param yTop = y coordinate of the door
     * @param width = width of the door
     * @param height = height of the door
     */
    public Door(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the door
     * @param g2 this the window that the building is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle door = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.DARK_GRAY); 
        g2.draw(door); 
        g2.fill(door); 
    } 
}
