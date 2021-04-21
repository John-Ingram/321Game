
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;

// TODO: Javadoc comments

public class startMenu extends JPanel {

    private JButton Start;
    private JButton End;

    //sets up the display for the menu
    public startMenu() {
        setBackground(Color.GREEN);
        add(new JLabel("startMenu"));
        createControls();
    }
    
    //creates the buttons to be displayed on the start menu
    public void createControls(){

        JButton Start = new JButton("Enter World");
        Start.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Start);

        //not sure if we need this since there should be an "x" on the popup menu
        JButton End = new JButton("End Game");
        End.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(End);
    }    

    

    //sets up the layout for the controls
    public void Layout(){
        JPanel controls = new JPanel();
        controls.add(Start);
        controls.add(End);

        add(controls, BorderLayout.SOUTH);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}

