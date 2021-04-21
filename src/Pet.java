import javax.swing.JPanel;

// TODO: Javadoc comments.
// TODO: Have the pet's needs be affected by time and the time controls (create an aging function basically).
// TODO: Have a prompt to create the pet's name if the pet has no name.
// TODO: Have the pet's status be affected by playing, cleaning, etc.
// TODO: Hook up the pet's stats to the buttons in the mainMenu class once this class is done.


/**
* @generated
*/
public class Pet extends JPanel {
    
    public Pet(String name){
	this.setPetName(name);
	this.setHygene((float) 0);
	this.setHunger((float) 0);
	this.setHappiness((float) 0);
	this.setSkill((float) 0);
    }
    
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
    private void setHunger(Float hunger) {
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
    private void setSkill(Float skill) {
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
    private void setHygene(Float hygene) {
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
    private void setHappiness(Float happiness) {
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
    
}
