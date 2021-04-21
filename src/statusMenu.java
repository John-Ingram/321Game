import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

// TODO: Javadoc comments

public class statusMenu extends JPanel{
    // TODO: Integrate the pet's status with the panel
    // TODO: Create a template for what the panel will look like

    public statusMenu(Pet pet) {
        setBackground(Color.PINK);
        add(new JLabel("statusMenu"));
	JLabel happiness = new JLabel("Happiness: " + pet.getHappiness());
	add(happiness);
	JLabel hygene = new JLabel("Hygene: " + pet.getHygene());
	add(hygene);
	JLabel hunger = new JLabel("Hunger: " + pet.getHunger());
	add(hunger);
	JLabel skill = new JLabel("Skill: " + pet.getSkill());
	add(skill);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
