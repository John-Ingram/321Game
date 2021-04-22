import javax.swing.JPanel;
import java.util.Date;

// TODO: Javadoc comments.
// TODO: Have the pet's needs be affected by time and the time controls (create an aging function basically).
// TODO: Have a prompt to create the pet's name if the pet has no name.
// TODO: Have the pet's status be affected by playing, cleaning, etc.
// TODO: Hook up the pet's stats to the buttons in the mainMenu class once this class is done.


@SuppressWarnings("serial")
public class Pet extends JPanel {
    
    public Pet(String name){
	this.setPetName(name);
	this.setHygene((float) 10);
	this.setHunger((float) 10);
	this.setHappiness((float) 10);
	this.setSkill((float) 10);
    }
    
    public float counter;
    public float timeSpeed;
    private final Date createdDate = new java.util.Date();

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
    */
    public String getPetName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private void setPetName(String name) {
        this.name = name;
    }
    
    /**
    * @generated
    */
    public Float getHunger() {
        return this.hunger;
    }
    
    /**
    * @generated
    */
    public void setHunger(Float hunger) {
        this.hunger = hunger;
    }
    
    /**
    * @generated
    */
    public Float getSkill() {
        return this.skill;
    }
    
    /**
    * @generated
    */
    public void setSkill(Float skill) {
        this.skill = skill;
    }
    
    /**
    * @generated
    */
    public Float getHygene() {
        return this.hygene;
    }
    
    /**
    * @generated
    */
    public void setHygene(Float hygene) {
        this.hygene = hygene;
    }
    
    /**
    * @generated
    */
    public Float getHappiness() {
        return this.happiness;
    }
    
    /**
    * @generated
    */
    public void setHappiness(Float happiness) {
        this.happiness = happiness;
    }
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    protected void playWithPet() {
	this.setHappiness(this.getHappiness() + 1);	
    }
    /**
    * @generated
    */
    protected void cleanPet() {
	this.setHygene(this.getHygene() + 1);
    }
    /**
    * @generated
    */
    protected void feedPet() {
	this.setHunger(this.getHunger() + 1);
    }
    /**
    * @generated
    */
    protected void upSkill() {
	this.setSkill(this.getSkill() +1);
    }
    /**
    * @generated
    */
    protected void checkStatus() {
        //TODO
    }

    // decay functions

public float skillDecay (float skill) {
    this.setSkill(this.getSkill() - 1);
    return skill;
 }
 
public float hungerDecay (float hunger) {
    this.setHunger(this.getHunger() - 1);
    return hunger;
 }
  
public float hygeneDecay (float hygene) {
    this.setHygene(this.getHappiness() - 1);
    return hygene;
 }
   
public float happinessDecay (float happiness) {
    this.setHappiness(this.getHappiness() - 1);
    return happiness;

 
    
 }

 public float timeCount() {
    java.util.Date now = new java.util.Date();
    return counter = (float)((now.getTime() - this.createdDate.getTime()) / 1000);
 }

 public void setTimeSpeed(float timeSpeed) {
    this.timeSpeed = timeSpeed;
}

/**
* @generated
*/
public Float getTimeSpeed() {
    return this.timeSpeed;
}

    
}
