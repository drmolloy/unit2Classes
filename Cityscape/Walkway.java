import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

/**
 * This class creates the walkway given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Walkway 
{
    /** the x coordinate of the walkway*/
    private int xLeft; 
    /** the y coordinate of the walkway*/
    private int yTop; 
    /** the height of the walkways*/
    private int height; 
    /** the width of the walkway*/
    private int width; 

    /**
     * constructor for the objects of the class walkway
     * @param xLeft = x coordinate of the walkway
     * @param yTop = y coordinate of the walkway
     * @param width = width of the walkway
     * @param height = height of the walkway
     */
    public Walkway(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the walkway
     * @param g2 this the window that the building is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle walkway = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.BLACK); 
        g2.draw(walkway); 
        g2.fill(walkway); 
    } 
}
