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
// TODO: Update the button images and pet with better art.
// TODO: Update the background.

@SuppressWarnings("serial")
public class mainMenu extends JPanel{

    private BufferedImage image; 

    private Pet pet;
    private final Date createdDate = new java.util.Date();

    public mainMenu(Pet pet) {
	    this.pet = pet;
        setBackground(Color.WHITE);
        add(new JLabel("Main Menu"));
        
        JLabel picLabel = PetImage();
        createControls(picLabel);
    }

    public void createControls(JLabel picLabel){
        // TODO: Integrate the pet's needs with the buttons. Pet class has to be done first.

        JButton Feed = new JButton("Feed");
        Feed.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    pet.feedPet();
                }
            }
        );
        Feed.setFont(new Font("Dialog", Font.BOLD, 10));
        Feed.setBorderPainted(false);
        Feed.setBackground(new Color(0xEE9458));


        JButton Clean = new JButton("Clean");
        Clean.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    pet.cleanPet(); 
                }
            }
        );
        Clean.setFont(new Font("Dialog", Font.BOLD, 10));
        Clean.setBorderPainted(false);
        Clean.setBackground(new Color(0xEE9458));
 

        JButton Play = new JButton("Play");
        Play.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pet.playWithPet();
                }
            }
        );
        Play.setFont(new Font("Dialog", Font.BOLD, 10));
        Play.setBorderPainted(false);
        Play.setBackground(new Color(0xEE9458));


        JButton Skill = new JButton("Skill");
        Skill.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    pet.upSkill();  
                }
            }
        );
        Skill.setFont(new Font("Dialog", Font.BOLD, 10));
        Skill.setBorderPainted(false);
        Skill.setBackground(new Color(0xEE9458));


        // TODO: Make these buttons actually change the time speed. Pet class has to be done first.
        JButton one = new JButton("1x");
        one.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pet.setTimeSpeed((float)1);
                }
            }
        );
        one.setFont(new Font("Dialog", Font.BOLD, 10));
        one.setBorderPainted(false);
        one.setBackground(new Color(0xA55536));
        one.setForeground(new Color(0xFEFEFE));

        JButton half = new JButton("0.5x");
        half.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pet.setTimeSpeed((float)0.5);
                }
            }
        );
        half.setFont(new Font("Dialog", Font.BOLD, 10));
        half.setBorderPainted(false);
        half.setBackground(new Color(0xA55536));
        half.setForeground(new Color(0xFEFEFE));

        JButton two = new JButton("2x");
        two.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pet.setTimeSpeed((float)2);
                }
            }
        );
        two.setFont(new Font("Dialog", Font.BOLD, 10));
        two.setBorderPainted(false);
        two.setBackground(new Color(0xA55536));
        two.setForeground(new Color(0xFEFEFE));
 
        JPanel needs = new JPanel();
        needs.setBackground(new Color(0xA3D8C8));
        needs.add(Feed);
        needs.add(Skill);
        needs.add(Clean);
        needs.add(Play);
        setLayout(new BorderLayout());
        add(needs, BorderLayout.NORTH);

        JPanel time = new JPanel();
        time.setBackground(new Color(0xA3D8C8));
        time.add(half);
        time.add(one);
        time.add(two);
        add(time, BorderLayout.SOUTH);

        JPanel pet = new JPanel();
        pet.add(picLabel);
        pet.setBackground(new Color(0xA3D8C8));
        add(pet, BorderLayout.CENTER);
        
    } 

    public JLabel PetImage(){
        try {
            image = ImageIO.read(new File("../resources/dog.png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // TODO: Resize image outside of program and update the resource image so we can avoid resizing in the program.

        ImageIcon icon = new ImageIcon(image);
        Image image = icon.getImage();
        Image new_img = image.getScaledInstance(225, 225,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_img);

        JLabel picLabel = new JLabel(icon);
        return picLabel;
       
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
