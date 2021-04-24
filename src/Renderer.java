/**
 * CS 321 - Final Project - Virtual Pet - Implementation
 * @author Laurel Strelzoff, John Ingram, Bobby Tighe, Katie Weaver, Brandon Perry
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
/**
 * Class that generates the layout.
 */
public class Renderer{
    
    //static variables
    private static Pet pet;
    private static MainMenu mMenu;
    private static StatusMenu sMenu;
    private static ExitMenu eMenu;
    private static StartMenu startMenu;
    private static JFrame frame;

    /**
     * Creates the basic panels.
     */
    private static void createComponents()
    {
        startMenu = new StartMenu();
        mMenu = new MainMenu(pet);
        sMenu = new StatusMenu(pet);
        eMenu = new ExitMenu();
    }

    /**
     * Resets the screen to its main state.
     */
    public static void resetMain()
    {
        frame.getContentPane().removeAll();
        addMainComponents(frame);
        frame.pack();
    }

    /**
     * Adds an overall layout to each JFrame that is called.
     * @param frame the JFrame that is being modified.
     */
    private static void addMainComponents(JFrame frame)
    {
        Container pane = frame.getContentPane();
        pane.setBackground(new Color(0xEE9458));
        GridBagConstraints c = new GridBagConstraints();
        
        frame.setTitle("Virtual Pet: " + startMenu.getName());

        // Set custom defaults
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER; 
        c.gridwidth = 1;

        // Add MainMenu
        c.weightx = 0.5; //Get half of the extra vertical space
        c.weighty = 0.5;   //request any extra vertical space
        c.gridx = 0;
        c.gridy = 0;
        pane.add(mMenu, c);

        // Add StatusMenu
        c.weightx = 0.5; //Get half of the extra vertical space
        c.weighty = 0.5;   //request any extra vertical space
        c.gridx = 1;
        c.gridy = 0;
        pane.add(sMenu, c);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pane.removeAll();
                    // Create new constraints to not mess with main layout
                    GridBagConstraints c = new GridBagConstraints(); 

                    c.weightx = 1; //Get half of the extra vertical space
                    c.weighty = 1;   //request any extra vertical space
                    c.gridx = 0;
                    c.gridy = 0;
                    pane.add(eMenu, c);
                    frame.pack();
                }
        }  );

        c.ipady = 10;       //pad the exit button
        c.ipadx = 10;       //pad the exit button
        c.weighty = 0;   //request any extra vertical space
        c.anchor = GridBagConstraints.LAST_LINE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;     
        c.gridwidth = 1;   //1 column wide
        c.gridy = 1;       //second row
        pane.add(exitButton, c);
    }
    
    /**
     * Modifies the exit menu.
     * @param frame The JFrame that is being modified.
     */
    private static void showStart(JFrame frame)
    {
        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Set custom defaults
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER; 
        c.gridwidth = 1;

        // Add StartMenu
        c.weightx = 0.5; //Get half of the extra vertical space
        c.weighty = 0.5;   //request any extra vertical space
        c.gridx = 0;
        c.gridy = 0;
        pane.add(startMenu, c);

    }

    /**
     * Sets up content for each frame.
     */
    private static void createAndShow()
    {   
        //Set up the content of the window
        createComponents();
        try {
            ImageIcon icon = new ImageIcon("resources/WindowIcon.png");
            frame.setIconImage(icon.getImage());
        } catch (Exception e) {
            //do nothing
        }
        showStart(frame);
        
        //Display the window
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * The main class that is running the game.
     * @param args
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                pet = new Pet("name");
                frame = new JFrame("Virtual Pet");
                createAndShow();
            }
        });
    }
}
