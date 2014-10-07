import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * This class creates the sun given the coordinates implemented in the component class
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class Sun
{
    /** the radius of the sun*/
    private int radius;
    /** the x coordinate of the sun*/
    private int xLeft;
    /** the y coordinate of the sun*/
    private int yTop;

    /**
     * constructor for the objects of the class sun
     * @param radius = the radius of the sun
     * @param xLeft = x coordinate of the sun
     * @param yTop = y coordinate of the sun
     */
    public Sun(int radius,int xLeft, int yTop)
    {
        this.radius = radius;
        this.xLeft = xLeft;
        this.yTop = yTop;
    }

    /**
     * Draws the sun
     * @param g2 this the window that the sun is drawn in
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(this.xLeft,this.yTop,this.radius,this.radius);
        g2.setPaint(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
    }
}
