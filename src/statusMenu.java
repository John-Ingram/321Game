import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.lang.Math;
import java.util.Date;

// TODO: Javadoc comments

@SuppressWarnings("serial")
public class statusMenu extends JPanel{
    // TODO: Integrate the pet's status with the panel
    // TODO: Create a template for what the panel will look like


	private final Date createdDate = new java.util.Date();
    private JLabel happiness, hygene, hunger, skill;
    private Pet pet;
	public float first = 0;
	float second = 0;
	float diff = 0;
	float counter = 0;
    
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

	// TODO: Make it round down

    public void updateStatus(){
		java.util.Date now = new java.util.Date();
        first = (float)((now.getTime() - this.createdDate.getTime()) / 1000);
		
		//compare first and second
		diff = first - second;

		if (diff >= (5 * pet.getTimeSpeed())){
			counter = diff / (5 * pet.getTimeSpeed());
			counter = Math.round(counter);
		}

		happiness.setText("Happiness: " + (pet.getHappiness() - counter));
		hygene.setText("Hygene: " + (pet.getHygene() - counter));
		hunger.setText("Hunger: " + (pet.getHunger()- counter));
		skill.setText("Skill: " + (pet.getSkill()- counter));

		second = first;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
