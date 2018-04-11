package Interface2;

/**
 * Created by savion.levi on 4/11/2018.
 */
public class RobotInterface {


    public static void main(String[] args) {
        OptimusPrime optimusPrime = new OptimusPrime();
        optimusPrime.attack();
        optimusPrime.specialAttack();
        optimusPrime.setModel("X");
        System.out.println("Optimus's current model is: " + optimusPrime.getModel());
        optimusPrime.setSpecialAttack("autoBotsUltimate !!");
        System.out.println("Optimus's special attack is: " + optimusPrime.getSpecialAttack());
        optimusPrime.setSpecialAttack("MegaTron obliteration !!");
        System.out.println("Optimus's special attack is: " + optimusPrime.getSpecialAttack());

    }

}
