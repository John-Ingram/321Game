/**
 * CS 321 - Final Project - Virtual Pet - Implementation
 * @author Laurel Strelzoff, John Ingram, Bobby Tighe, Katie Weaver, Brandon Perry
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


@SuppressWarnings("serial")
/**
 * Class that creates the Status menu panel.
 */
public class StatusMenu extends JPanel{

	// variables and initialization
    private JLabel happiness, hygene, hunger, skill;
	private Pet pet;
	private Timer timer;

	long countDownTimeMS = 5*1000;
	long previousUpdateTime = 0;
	
	/*
	* Creates the status menu for the pets stats
	* @param pet the pet of class Pet
	*/
    public StatusMenu(Pet pet) {
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

		// updates previous time for future calculations
		previousUpdateTime = System.currentTimeMillis();

		// Updates the status of the pet every $countDownTimeMS milliseconds

		TimerTask t = new TimerTask(){
				@Override
				public void run(){
					updateStatus();
				}
			};

		Timer timer = new Timer();
		timer.schedule(t,0l,countDownTimeMS);


		// writes out stats of pet
		updateStatus(timer);
    }

	/*
	* Updates the stats of the pet in the status menu and takes into account the decay of the values over time 
	*/
    private void updateStatus(Timer timer){
		
		// finds elapsed time
		long elapsedTimeMS = System.currentTimeMillis() - previousUpdateTime;

		float counter = 0;
		
		// sets pet stats to decayed values if enough time has passed
		if (elapsedTimeMS >= (countDownTimeMS / pet.getTimeSpeed())){
			counter = (float)Math.floor(elapsedTimeMS / (countDownTimeMS / pet.getTimeSpeed()));
			pet.setHappiness(pet.getHappiness() - counter);
			pet.setHygene(pet.getHygene() - counter);
			pet.setHunger(pet.getHunger() - counter);
			pet.setSkill(pet.getSkill() - counter);

			previousUpdateTime = System.currentTimeMillis();	
		}

		// prints out pets stats
		happiness.setText("Happiness: " + pet.getHappiness());
		hygene.setText("Hygiene: " + pet.getHygene());
		hunger.setText("Hunger: " + pet.getHunger());
		skill.setText("Skill: " + pet.getSkill());

		// Handle loss
		if (pet.getHappiness() < 1) lossHandler(timer, "unhappy");
		if (pet.getHygene() < 1) lossHandler(timer, "dirty");
		if (pet.getHunger() < 1) lossHandler(timer, "hungry");
		if (pet.getSkill() < 1) lossHandler(timer, "horribly trained");

	}

	/**
	 * Sends the loss message, and stops the game
	 * @param timer
	 * @param value
	 * @param message
	 */
	private void lossHandler(Timer timer, String message)
	{
		clearStatText();
		happiness.setText("Your pet was so "+ message);
		hygene.setText("that animal services had to take it!");
		timer.stop();
	}

	/**
	 * Clears the Stat Text so a loss message can be displayed.
	 */
	private void clearStatText()
	{
		happiness.setText("");
		hygene.setText("");
		hunger.setText("");
		skill.setText("");
	}
	
    @Override
	 /**
     * Sets the size of the game.
     */
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
