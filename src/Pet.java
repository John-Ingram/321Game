import javax.swing.JPanel;

// TODO: Javadoc comments.
// TODO: Have a prompt to create the pet's name if the pet has no name.
// TODO: Have the pet's status be affected by playing, cleaning, etc.

@SuppressWarnings("serial")

// Class that contains the stats of the pet as well as the functions to alter them through user interact
public class Pet extends JPanel {

    // initializing the pets default stat values (10)
    public Pet(String name){
	this.setPetName(name);
	this.setHygene((float) 10);
	this.setHunger((float) 10);
	this.setHappiness((float) 10);
	this.setSkill((float) 10);
    }
    // varaibles to help with decaying the values over
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
    * Gets the pets name
    * @return name the pet name
    */
    public String getPetName() {
        return this.name;
    }
    
    /**
    * @generated
    * Sets the pets name
    * @param name name of the pet
    */
    private void setPetName(String name) {
        this.name = name;
    }
    
    /**
    * @generated
    * Gets the pets hunger stat
    * @return hunger the hunger stat
    */
    public Float getHunger() {
        return this.hunger;
    }
    
    /**
    * @generated
    * Sets the pets hunger stat
    * @param hunger the hunger stat
    */
    public void setHunger(Float hunger) {
        this.hunger = hunger;
    }
    
    /**
    * @generated
    * Gets the pets skill stat
    * @return skill the skill stat
    */
    public Float getSkill() {
        return this.skill;
    }
    
    /**
    * @generated
    * Sets the pets skill stat
    * @param skill the skill stat
    */
    public void setSkill(Float skill) {
        this.skill = skill;
    }
    
    /**
    * @generated
    * Gets the pets hygiene stat
    * @return hygiene the hygiene stat
    */
    public Float getHygene() {
        return this.hygene;
    }
    
    /**
    * @generated
    * Sets the pets hygiene stat
    * @param hygiene the hygiene stat
    */
    public void setHygene(Float hygene) {
        this.hygene = hygene;
    }
    
    /**
    * @generated
    * Gets the pets happiness stat
    * @return happiness the happiness stat
    */
    public Float getHappiness() {
        return this.happiness;
    }
    
    /**
    * @generated
    * Sets the pets happiness stat
    * @param happiness the happiness stat
    */
    public void setHappiness(Float happiness) {
        this.happiness = happiness;
    }
    
    

    //                          Operations                                  
    
    /**
    * @generated
    * Increases the pets happiness stat by 1 
    */
    protected void playWithPet() {
	this.setHappiness(this.getHappiness() + 1);	
    }

    /**
    * @generated
    * Increases the pets hygiene stat by 1
    */
    protected void cleanPet() {
	this.setHygene(this.getHygene() + 1);
    }

    /**
    * @generated
    * Increases the pets hunger stat by 1
    */
    protected void feedPet() {
	this.setHunger(this.getHunger() + 1);
    }

    /**
    * @generated
    * Increases the pets skill stat by 1
    */
    protected void upSkill() {
	this.setSkill(this.getSkill() +1);
    }
 
    /*
    * Sets the timeSpeed values
    * @param timeSpeed the timeSpeed value
    */
    public void setTimeSpeed(float timeSpeed) {
        this.timeSpeed = timeSpeed;
    }

    /*
    * Gets the timeSpeed value
    * @return timeSpeed the timeSpeed
    */
    public Float getTimeSpeed() {
        return this.timeSpeed;
    } 
}
