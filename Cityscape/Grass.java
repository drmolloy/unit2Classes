import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

/**
 * This class creates the grass given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Grass 
{
    /** the x coordinate of the grass*/
    private int xLeft; 
    /** the y coordinate of the grass*/
    private int yTop; 
    /** the height of the grass*/
    private int height; 
    /** the width of the grass*/
    private int width; 

    /**
     * constructor for objects of class grass
     * @param xLeft = x coordinate of the grass
     * @param yTop = y coordinate of the grass
     * @param width = width of the grass
     * @param height = height of the grass
     */
    public Grass(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the grass
     * @param g2 this the window that the grass is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle grass = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.GREEN); 
        g2.draw(grass); 
        g2.fill(grass); 
    } 
}
