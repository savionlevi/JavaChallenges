package Interface2;

/**
 * Created by savion.levi on 4/11/2018.
 */
public class OptimusPrime implements Robot{

    public int power;
    public String group;
    public String specialAttack;
    public String model;


    public void printModel() {
        System.out.println("This is the model number: "+this.model);
    }
    public void specialAttack() {
        System.out.println("Optimus has lunched his SPECIAL attack!");
    }
    public void attack() {
        System.out.println("Optimus has lunched his regular [boring] attack..");
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public String getSpecialAttack(){
        return this.specialAttack;
    }



}
