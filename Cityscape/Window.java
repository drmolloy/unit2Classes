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
public class Window 
{
    /** the x coordinate of the window*/
    private int xLeft; 
    /** the y coordinate of the window*/
    private int yTop;
    /** the height of the window*/
    private int height; 
    /** the width of the window*/
    private int width; 

    /**
     * constructor for objects of class window
     * @param xLeft = x coordinate of the window
     * @param yTop = y coordinate of the window
     * @param width = width of the window
     * @param height = height of the window
     */
    public Window
    (int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    /**
     * Draws the window
     * @param g2 this the window that the window is drawn in
     */
    public void draw(Graphics2D g2) 
    { 
        Rectangle window1 = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.YELLOW);
        g2.draw(window1); 
        g2.fill(window1); 
        
        
    }
    
}
