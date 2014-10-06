import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Rectangle;

public class Cityscape
{
    private int xLeft;
    private int yTop;
    private int height;
    private int width;
    
    public Cityscape(int xLeft, int yTop, int width, int height)
    {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.width = width;
        this.height = height;
        
       
    }

    public void draw(Graphics2D g2)
    {
       Rectangle building = new Rectangle(xLeft,yTop,width,height);
       g2.setPaint(Color.BLACK);
       g2.draw(building);
       g2.fill(building);
    }
}