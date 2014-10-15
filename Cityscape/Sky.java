import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

/**
 * This class creates the sky given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Sky 
{
    /**the x coordinate of the sky*/
    private int xLeft; 
    /**the y coordinate of the sky*/
    private int yTop; 
    /**the height of the sky*/
    private int height; 
    /**the width of the sky*/
    private int width; 

     /**
     * constructor for the objects of the class sky
     * @param xLeft = x coordinate of the sky
     * @param yTop = y coordinate of the sky
     * @param width = width of the sky
     * @param height = height of the sky
     */
    public Sky(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the sky
     * @param g2 this the window that the building is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle sky = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.BLUE); 
        g2.draw(sky); 
        g2.fill(sky); 
    } 
}
