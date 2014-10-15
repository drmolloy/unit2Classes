import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * This class creates the circles which will form together to create a cloud
 * 
 * Duncan Molloy
 * 10/7/14
 */
public class Cloud
{
    /** the radius of a circle to make up the cloud*/
    private int radius;
    /** the x coordinate of a circle of the sun*/
    private int xLeft;
    /** the y coordinate of a circle of the sun*/
    private int yTop;

    /**
     * constructor for the objects of the class cloud
     * @param radius = the radius of the cloud
     * @param xLeft = x coordinate of the cloud
     * @param yTop = y coordinate of the cloud
     */
    public Cloud(int radius,int xLeft, int yTop)
    {
        this.radius = radius;
        this.xLeft = xLeft;
        this.yTop = yTop;
    }

    /**
     * Draws the cloud
     * @param g2 this is the window that the cloud is drawn in
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double cloud = new Ellipse2D.Double(this.xLeft,this.yTop,this.radius,this.radius);
        g2.setPaint(Color.WHITE);
        g2.draw(cloud);
        g2.fill(cloud);
    }
}

