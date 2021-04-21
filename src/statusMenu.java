import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class statusMenu extends JPanel{
    public statusMenu() {
        setBackground(Color.PINK);
        add(new JLabel("statusMenu"));
       
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
