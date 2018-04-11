package InterfacePractice;

/**
 * Created by savion.levi on 4/11/2018.
 */
public class Hero implements Character {

    public String weapon = "lightsaber";

    public void attack(){
        System.out.println("The enemy attacks the enemy!");
    }


    public void getWeapon(){
        System.out.println(this.weapon);
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals you");
    }
}
