package InterfacePractice;

import java.util.Random;

/**
 * Created by savion.levi on 4/11/2018.
 */
public class StarWarsInterface {

    public static Character summonCharacter() {
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2 == 0) {
            return new Enemy();
        }
        else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero Obi_Wan_Kenobi = new Hero();

        darthVader.attack();
        Obi_Wan_Kenobi.attack();
        darthVader.heal();
        Obi_Wan_Kenobi.heal();
        darthVader.getWeapon();
        Obi_Wan_Kenobi.getWeapon();
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }

}
