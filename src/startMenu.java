
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class startMenu extends JPanel {

    public startMenu() {
        setBackground(Color.GREEN);
        add(new JLabel("startMenu"));
       
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}

