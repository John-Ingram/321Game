
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class mainMenu extends JPanel {

    private JButton Feed;
    private JButton Clean;
    private JButton Play;
    private JButton Skill;


    public mainMenu() {
        setBackground(Color.WHITE);
        add(new JLabel("Main Menu"));

        createControls();
    }

    public void createControls(){
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

    } 

    public void Layout(){
        JPanel controls = new JPanel();
        controls.add(Skill);
        controls.add(Play);
        controls.add(Clean);
        controls.add(Feed);

        add(controls, BorderLayout.SOUTH);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}