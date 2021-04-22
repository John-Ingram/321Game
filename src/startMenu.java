// attribution
// <a href="https://www.vecteezy.com/free-vector/dog">Dog Vectors by Vecteezy</a>

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import java.util.Date;

// TODO: Javadoc comments
@SuppressWarnings("serial")
public class startMenu extends JPanel {
    private BufferedImage image; 
    private JButton Start;

    /*
    * Sets up the display for the menu
    */
    public startMenu() {
        setBackground(new Color(0xA3D8C8));
        //add(new JLabel("Virtual Pet    "));
        createControls();
    }
    
    /*
    * Creates the buttons to be displayed on the start menu
    */
    public void createControls(){

        JButton Start = new JButton("Adopt a Virtual Pet!");
        Start.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    GameFrame.showMain();
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

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}

