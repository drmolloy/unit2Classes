import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class Cloud
{
    private int radius;
    private int xLeft;
    private int yTop;

    public Cloud(int radius,int xLeft, int yTop)
    {
        this.radius = radius;
        this.xLeft = xLeft;
        this.yTop = yTop;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double cloud = new Ellipse2D.Double(this.xLeft,this.yTop,this.radius,this.radius);
        g2.setPaint(Color.WHITE);
        g2.draw(cloud);
        g2.fill(cloud);
    }
}

