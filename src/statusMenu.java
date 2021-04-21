import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

// TODO: Javadoc comments

@SuppressWarnings("serial")
public class statusMenu extends JPanel{
    // TODO: Integrate the pet's status with the panel
    // TODO: Create a template for what the panel will look like

    private JLabel happiness, hygene, hunger, skill;
    private Pet pet;
    
    public statusMenu(Pet pet) {
	this.pet = pet;
	
        setBackground(Color.PINK);
	SpringLayout layout = new SpringLayout();
	setLayout(layout);

	JLabel statusMenu = new JLabel("Status Menu");
	add(statusMenu);
	
	happiness = new JLabel();
	hygene = new JLabel();
	hunger = new JLabel();
	skill = new JLabel();

	// Coordinates for the label, with (0,0) in the top-left corner
	layout.putConstraint(SpringLayout.WEST, statusMenu, 5, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, statusMenu, 5, SpringLayout.NORTH, this);
	
	layout.putConstraint(SpringLayout.WEST, happiness, 5, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, happiness, 25, SpringLayout.NORTH, this);

	layout.putConstraint(SpringLayout.WEST, hygene, 5, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, hygene, 45, SpringLayout.WEST, this);

	layout.putConstraint(SpringLayout.WEST, hunger, 5, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, hunger, 65, SpringLayout.WEST, this);
	
	layout.putConstraint(SpringLayout.WEST, skill, 5, SpringLayout.WEST, this);
	layout.putConstraint(SpringLayout.NORTH, skill, 85, SpringLayout.WEST, this);

	add(happiness);
	add(hygene);
	add(hunger);
	add(skill);

	updateStatus();
    }

    public void updateStatus(){
	happiness.setText("Happiness: " + pet.getHappiness());
	hygene.setText("Hygene: " + pet.getHygene());
	hunger.setText("Hunger: " + pet.getHunger());
	skill.setText("Skill: " + pet.getSkill());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
