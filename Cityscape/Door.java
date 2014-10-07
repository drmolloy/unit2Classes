import java.awt.Graphics2D; 
import java.awt.geom.Ellipse2D; 
import java.awt.Color; 
import java.awt.Rectangle; 

public class Door 
{
    private int xLeft; 
    private int yTop; 
    private int height; 
    private int width; 

    public Door(int xLeft, int yTop, int width, int height) 
    { 
        this.xLeft = xLeft; 
        this.yTop = yTop; 
        this.width = width; 
        this.height = height; 

    } 

    public void draw(Graphics2D g2) 
    { 
        Rectangle door = new Rectangle(xLeft,yTop,width,height); 
        g2.setPaint(Color.DARK_GRAY); 
        g2.draw(door); 
        g2.fill(door); 
    } 
}
