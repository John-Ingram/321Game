/**
 * CS 321 - Final Project - Virtual Pet - Implementation
 * @author Laurel Strelzoff, John Ingram, Bobby Tighe, Katie Weaver, Brandon Perry
 */
// attribution
// <a href="https://www.vecteezy.com/free-vector/dog">Dog Vectors by Vecteezy</a>

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

@SuppressWarnings("serial")

/**
 * Creates the Start Menu panel.
 */
public class StartMenu extends JPanel {
    private BufferedImage image; 
    private JButton Start;
    private JTextField nameField;

    /*
    * Sets up the display for the menu
    */
    public StartMenu() {
        setBackground(new Color(0xA3D8C8));
        //add(new JLabel("Virtual Pet    "));
        createControls();
    }
    
    /*
    * Creates the buttons to be displayed on the start menu
    */
    public void createControls(){
        
        JButton Start = new JButton("Adopt a Pet!");
        nameField = new JTextField("Name Your Pet", 16);
        nameField.addKeyListener(
            new KeyListener(){
                public void keyPressed(java.awt.event.KeyEvent k) {};
                public void keyTyped(java.awt.event.KeyEvent k) {
                    Start.setText("Adopt " + nameField.getText() + "!");
                };        
                public void keyReleased(java.awt.event.KeyEvent k) {
                    Start.setText("Adopt " + nameField.getText() + "!");
                };
            }
        );
        add(nameField);


        Start.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Renderer.resetMain();
                }
            }
        );
        Start.setBackground(new Color(0xEE9458));
        add(Start);


        JLabel picLabel = PetImage();
        JPanel pet = new JPanel();
        pet.add(picLabel);
        pet.setBackground(new Color(0xA3D8C8));
        add(pet, BorderLayout.CENTER);
    }    

    /*
    * Sets up the image for the pet
    * @return the image of the pet.
    */
    public JLabel PetImage(){

        try {
            image = ImageIO.read(new File("resources/adopt.png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        ImageIcon icon = new ImageIcon(image);
        Image image = icon.getImage();
        Image new_img = image.getScaledInstance(200, 238,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_img);

        JLabel picLabel = new JLabel(icon);
        return picLabel;
       
    }

    /*
    * Sets up the layout for the controls
    */
    public void Layout(){
        JPanel controls = new JPanel();
        controls.add(Start);
        add(controls, BorderLayout.SOUTH);
    }

    /**
     * Gets the name.
     */
    public String getName()
    {
        return nameField.getText();
    }

    @Override
    /**
     * Sets the size of the game.
     */
    public Dimension getPreferredSize() {
        return new Dimension(600, 300);
    }
}

