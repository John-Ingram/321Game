
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class mainMenu extends JPanel {

    public mainMenu() {
        setBackground(Color.BLUE);
        add(new JLabel("mainMenu"));
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


        JButton Status = new JButton("Status");
        Status.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                }
            }
        );
        add(Status);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}