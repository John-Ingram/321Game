import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

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
	setLayout(new GridLayout(5, 2, 1, 1));

	JLabel statusMenu = new JLabel("statusMenu");
	statusMenu.setVerticalAlignment(JLabel.TOP);
	add(statusMenu);
	
	happiness = new JLabel();
	hygene = new JLabel();
	hunger = new JLabel();
	skill = new JLabel();

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
