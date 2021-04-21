
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class exitMenu extends JPanel {

    public exitMenu() {
        setBackground(Color.RED);
        add(new JLabel("Are you sure you want to exit?"));

        JButton Yes = new JButton("YES");
        Yes.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // exit program, button currently nonfunctional
                }
            }
        );
        add(Yes);
        
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
