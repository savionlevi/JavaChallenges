package Car_Inheritence;

/**
 * Created by savion.levi on 3/27/2018.
 */
public class Car extends Vehicle{

    public int NumberOfDoors;
    public boolean haveTrunk;
    public int price;

    public Car(int NumberOfDoors, boolean haveTrunk ,int price ){
        this.NumberOfDoors = NumberOfDoors;
        this.haveTrunk = haveTrunk;
        this.price = price;
    }

    public Car(){
        this.NumberOfDoors = 4;
        this.haveTrunk = true;
        this.price = 10000;
    }
}
