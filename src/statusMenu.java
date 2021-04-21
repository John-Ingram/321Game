import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

// TODO: Javadoc comments

public class statusMenu extends JPanel{
    // TODO: Integrate the pet's status with the panel
    // TODO: Create a template for what the panel will look like

    public statusMenu() {
        setBackground(Color.PINK);
        add(new JLabel("statusMenu"));
       
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
