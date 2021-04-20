
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class exitMenu extends JPanel {

    public exitMenu() {
        setBackground(Color.RED);
        add(new JLabel("exitMenu"));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
