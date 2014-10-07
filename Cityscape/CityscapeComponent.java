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

        
        Grass grass = new Grass(0,350,600,250);
        grass.draw(g2);
        
        Sky sky = new Sky(0,0,600,350);
        sky.draw(g2);
        
        Building building = new Building(0,150,150,300);
        building.draw(g2);
        
        Window window1 = new Window(20,170,20,20);
        window1.draw(g2);
        Window window2 = new Window(20,220,20,20);
        window2.draw(g2);
        Window window3 = new Window(20,270,20,20);
        window3.draw(g2);
        Window window4 = new Window(20,320,20,20);
        window4.draw(g2);
        Window window5 = new Window(100,170,20,20);
        window5.draw(g2);
        Window window6 = new Window(100,220,20,20);
        window6.draw(g2);
        Window window7 = new Window(100,270,20,20);
        window7.draw(g2);
        Window window8 = new Window(100,320,20,20);
        window8.draw(g2);
        
        
        Sun sun = new Sun(100,400,0);      
        sun.draw(g2);
        
        Building building2 = new Building(300,150,150,300);
        building2.draw(g2);
        
        Window window9 = new Window(320,170,20,20);
        window9.draw(g2);
        Window window10 = new Window(320,220,20,20);
        window10.draw(g2);
        Window window11 = new Window(320,270,20,20);
        window11.draw(g2);
        Window window12 = new Window(320,320,20,20);
        window12.draw(g2);
        Window window13 = new Window(400,170,20,20);
        window13.draw(g2);
        Window window14 = new Window(400,220,20,20);
        window14.draw(g2);
        Window window15 = new Window(400,270,20,20);
        window15.draw(g2);
        Window window16 = new Window(400,320,20,20);
        window16.draw(g2);
        
        Walkway walkway = new Walkway(150,220,150,50);
        walkway.draw(g2);
        
        Window window17 = new Window(170,230,20,20);
        window17.draw(g2);
        Window window18 = new Window(220,230,20,20);
        window18.draw(g2);
        Window window19 = new Window(270,230,20,20);
        window19.draw(g2);
        
        Cloud cloud1 = new Cloud(70,0,0);
        cloud1.draw(g2);
        Cloud cloud2 = new Cloud(70,40,0);
        cloud2.draw(g2);
        Cloud cloud3 = new Cloud(70,80,0);
        cloud3.draw(g2);
        Cloud cloud4 = new Cloud(70,0,40);
        cloud4.draw(g2);
        Cloud cloud5 = new Cloud(70,40,40);
        cloud5.draw(g2);
        Cloud cloud6 = new Cloud(70,80,40);
        cloud6.draw(g2);
       
        Door door1 = new Door(50,350,50,100);
        door1.draw(g2);
        Door door2 = new Door(350,350,50,100);
        door2.draw(g2);
        

    }
}
