import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Renderer{
    
    //static variables
    private static Pet pet;
    private static MainMenu mainMenu;
    private static StatusMenu statusMenu;

    private static void addComponents(Container pane)
    {

    }
    
    private static void createAndShow()
    {   
        //Create window
        JFrame frame = new JFrame("Game Title");

        addComponents(frame.getContentPane());
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShow();
            }
        });
    }
}
