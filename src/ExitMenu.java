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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
/**
 * Creates the exit menu panel.
 */
public class ExitMenu extends JPanel {

    private BufferedImage image; 

    /**
     * Creates the exit menu's layout.
     */
    public ExitMenu() {
        setBackground(new Color(0xA3D8C8));
        add(new JLabel("Are you sure you want to exit?"));

        JButton Yes = new JButton("YES");
        Yes.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    System.exit(0); 
                }
            }
        );
        Yes.setBorderPainted(false);
        Yes.setBackground(new Color(0xA55536));
        Yes.setForeground(new Color(0xFEFEFE));
        add(Yes);
        
        JButton No = new JButton("NO");
        No.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		        Renderer.resetMain(); 
                }
            }
        );
        No.setBorderPainted(false);
        No.setBackground(new Color(0xA55536));
        No.setForeground(new Color(0xFEFEFE));
        add(No);

        JLabel picLabel = PetImage();
        JPanel pet = new JPanel();
        pet.add(picLabel);
        pet.setBackground(new Color(0xA3D8C8));
        add(pet, BorderLayout.CENTER);
        
    }

    /**
     * Inserts the image for the exit page.
     * @return The image embedded into the exit page.
     */
    public JLabel PetImage(){

        try {
            image = ImageIO.read(new File("../resources/shocked_dog.png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        ImageIcon icon = new ImageIcon(image);
        Image image = icon.getImage();
        Image new_img = image.getScaledInstance(218, 225,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_img);

        JLabel picLabel = new JLabel(icon);
        return picLabel;
       
    }
    
    @Override
     /**
     * Sets the size of the game.
     */
    public Dimension getPreferredSize() {
        return new Dimension(600, 300);
    }
}
