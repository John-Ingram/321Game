
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;

// TODO: Javadoc comments
@SuppressWarnings("serial")
public class startMenu extends JPanel {

    private JButton Start;

    /*
    * Sets up the display for the menu
    */
    public startMenu() {
        setBackground(Color.GREEN);
        add(new JLabel("startMenu"));
        createControls();
    }
    
    /*
    * Creates the buttons to be displayed on the start menu
    */
    public void createControls(){

        JButton Start = new JButton("Enter World");
        Start.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    GameFrame.showMain();
                }
            }
        );
        add(Start);
    }    

    

    /*
    * Sets up the layout for the controls
    */
    public void Layout(){
        JPanel controls = new JPanel();
        controls.add(Start);
        add(controls, BorderLayout.SOUTH);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}

