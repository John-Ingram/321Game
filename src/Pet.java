/**
 * CS 321 - Final Project - Virtual Pet - Implementation
 * @author Laurel Strelzoff, John Ingram, Bobby Tighe, Katie Weaver, Brandon Perry
 */

import javax.swing.JPanel;
@SuppressWarnings("serial")

/**
 * Class that contains the stats of the pet as well as the functions to alter them through user interaction.
 */ 
public class Pet extends JPanel {

    // initializing the pets default stat values (10)
    public Pet(String name){
        this.setPetName(name);
        this.setHygene((float) 10);
        this.setHunger((float) 10);
        this.setHappiness((float) 10);
        this.setSkill((float) 10);
    }

    // variables to help with decaying the pet's stats over time
    public float counter = 0;
    public float timeSpeed = 1;

    // variables for pet
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private Float hunger;
    
    /**
    * @generated
    */
    private Float skill;
    
    /**
    * @generated
    */
    private Float hygene;
    
    /**
    * @generated
    */
    private Float happiness;
    
    /**
    * @generated
    * Gets the pet's name.
    * @return the pet's name.
    */
    public String getPetName() {
        return this.name;
    }
    
    /**
    * @generated
    * Sets the pet's name.
    * @param name The pet's new name.
    */
    private void setPetName(String name) {
        this.name = name;
    }
    
    /**
    * @generated
    * Gets the pet's hunger stat.
    * @return The pet's hunger level.
    */
    public Float getHunger() {
        return this.hunger;
    }
    
    /**
    * @generated
    * Sets the pet's hunger stat.
    * @param hunger The updated hunger stat.
    */
    public void setHunger(Float hunger) {
        this.hunger = hunger;
    }
    
    /**
    * @generated
    * Gets the pet's skill stat.
    * @return The pet's skill level.
    */
    public Float getSkill() {
        return this.skill;
    }
    
    /**
    * @generated
    * Sets the pet's skill stat.
    * @param skill The updated skill stat.
    */
    public void setSkill(Float skill) {
        this.skill = skill;
    }
    
    /**
    * @generated
    * Gets the pet's hygiene stat.
    * @return The pet's hygiene level.
    */
    public Float getHygene() {
        return this.hygene;
    }
    
    /**
    * @generated
    * Sets the pet's hygiene stat.
    * @param hygiene The updated hygiene stat.
    */
    public void setHygene(Float hygene) {
        this.hygene = hygene;
    }
    
    /**
    * @generated
    * Gets the pet's happiness level.
    * @return The pet's happiness level.
    */
    public Float getHappiness() {
        return this.happiness;
    }
    
    /**
    * @generated
    * Sets the pet's happiness stat.
    * @param happiness The pet's happiness level.
    */
    public void setHappiness(Float happiness) {
        this.happiness = happiness;
    }
    
    

    //                          Operations                                  
    
    /**
    * @generated
    * Increases the pet's happiness stat by 1 .
    */
    protected void playWithPet() {
	this.setHappiness(this.getHappiness() + 1);	
    }

    /**
    * @generated
    * Increases the pet's hygiene stat by 1.
    */
    protected void cleanPet() {
	this.setHygene(this.getHygene() + 1);
    }

    /**
    * @generated
    * Increases the pet's hunger stat by 1.
    */
    protected void feedPet() {
	this.setHunger(this.getHunger() + 1);
    }

    /**
    * @generated
    * Increases the pet's skill stat by 1.
    */
    protected void upSkill() {
	this.setSkill(this.getSkill() +1);
    }
 

    /**
     * Sets the time speed of the game.
     * @param timeSpeed The updated time speed of the game.
     */
    public void setTimeSpeed(float timeSpeed) {
        this.timeSpeed = timeSpeed;
    }

    /**
     * Gets the value for the speed of the game.
     * @return The time speed of the game.
     */
    public Float getTimeSpeed() {
        return this.timeSpeed;
    } 
}
