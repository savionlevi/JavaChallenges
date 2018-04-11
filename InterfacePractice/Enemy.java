package InterfacePractice;

import java.lang.*;

/**
 * Created by savion.levi on 4/11/2018.
 */
public class Enemy implements Character {

    public String weapon = "lightsaber";

    public Enemy() {

    }

    public void getWeapon(){
        System.out.println(this.weapon);
    }


    public void attack(){
        System.out.println("The enemy attacks YOU!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){
        System.out.println("draw out weapon");
    }


}
