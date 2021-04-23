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

// TODO: Javadoc comments

@SuppressWarnings("serial")
public class exitMenu extends JPanel {

    private BufferedImage image; 

    public exitMenu() {
        setBackground(new Color(0xA3D8C8));
        add(new JLabel("Are you sure you want to exit?"));


        // TODO: Make this button actually work
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

        JLabel picLabel = PetImage();
        JPanel pet = new JPanel();
        pet.add(picLabel);
        pet.setBackground(new Color(0xA3D8C8));
        add(pet, BorderLayout.CENTER);
        
    }

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
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
