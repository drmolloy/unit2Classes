import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * This component draws the buildings,
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
        
       Cityscape cityscape = new Cityscape(0,600,100,200);
        
       cityscape.draw(g2);
    }
}