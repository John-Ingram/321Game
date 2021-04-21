
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// TODO: Javadoc comments

public class mainMenu extends JPanel{

    private JButton Feed;
    private JButton Clean;
    private JButton Play;
    private JButton Skill;
    private JButton half;
    private JButton one;
    private JButton two;
    private BufferedImage image; 


    public mainMenu() {
        setBackground(Color.WHITE);
        add(new JLabel("Main Menu"));

        createControls();
       // Layout();
        
    }

    public void createControls(){
        // TODO: Integrate the pet's needs with the buttons.
        // TODO: Add a placement holder for the pet's photo.

        JButton Feed = new JButton("Feed");
        Feed.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Feed);

        JButton Clean = new JButton("Clean");
        Clean.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Clean);

        JButton Play = new JButton("Play");
        Play.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Play);

        JButton Skill = new JButton("Skill");
        Skill.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Skill);

        // TODO: Make these buttons actually change the time speeds.
        JButton one = new JButton("1x");
        one.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(one);

        JButton half = new JButton("0.5x");
        half.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(half);

        JButton two = new JButton("2x");
        two.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(two);

        // TODO: Insert a placeholder image for our pet.
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
        add(picLabel);

    } 
    /*
    public void Layout(){
        JPanel needs = new JPanel();
        needs.add(Skill);
        needs.add(Play);
        needs.add(Clean);
        needs.add(Feed);

        JPanel time = new JPanel();
        time.add(half);
        time.add(one);
        time.add(two);

        Container pane = frame.getContentPane();
        pane.add(needs, BorderLayout.NORTH);
        pane.add(time, BorderLayout.SOUTH); 

    }
    */


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}