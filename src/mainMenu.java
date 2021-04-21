
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

// TODO: Javadoc comments
// TODO: Update the button images and pet with better art.
// TODO: Update the background.

@SuppressWarnings("serial")
public class mainMenu extends JPanel{

    private BufferedImage image; 

    private Pet pet;

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


        JButton Clean = new JButton("Clean");
        Clean.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    pet.cleanPet(); 
                }
            }
        );
 

        JButton Play = new JButton("Play");
        Play.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pet.playWithPet();
                }
            }
        );


        JButton Skill = new JButton("Skill");
        Skill.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		    pet.upSkill();  
                }
            }
        );


        // TODO: Make these buttons actually change the time speed. Pet class has to be done first.
        JButton one = new JButton("1x");
        one.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
 

        JButton half = new JButton("0.5x");
        half.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
 

        JButton two = new JButton("2x");
        two.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
 

        JPanel needs = new JPanel();
        needs.add(Feed);
        needs.add(Skill);
        needs.add(Clean);
        needs.add(Play);
        setLayout(new BorderLayout());
        add(needs, BorderLayout.NORTH);

        
        JPanel time = new JPanel();
        time.add(half);
        time.add(one);
        time.add(two);
        add(time, BorderLayout.SOUTH);

        JPanel pet = new JPanel();
        pet.add(picLabel);
        add(pet, BorderLayout.CENTER);
        
    } 

    public JLabel PetImage(){

        try {
            image = ImageIO.read(new File("resources/placeholder_pet.png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // TODO: Resize image outside of program and update the resource image so we can avoid resizing in the program.

        ImageIcon icon = new ImageIcon(image);
        Image image = icon.getImage();
        Image new_img = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_img);

        JLabel picLabel = new JLabel(icon);
        return picLabel;
       
    }
    
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
