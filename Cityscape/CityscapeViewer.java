import javax.swing.JFrame; 

/**
 * This class creates the frame 
 * 
 * Duncan Molloy 
 * 10/7/14
 */
public class CityscapeViewer 
{ 
    /**
     * creates the frame based on the size set with the setSize method and sets the frame visible
     */
    public static void main(String [] args) 
    { 
        JFrame frame = new JFrame(); 

        frame.setSize(600,600); 
        frame.setTitle("Cityscape"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        CityscapeComponent component = new CityscapeComponent(); 
        frame.add(component); 

        frame.setVisible(true); 
    }
}
