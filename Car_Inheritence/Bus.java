package Car_Inheritence;

import sample.Person;

import java.util.ArrayList;

/**
 * Created by savion.levi on 3/27/2018.
 */
public class Bus extends Vehicle{

    public String busDriversName;
    public int fareCost;
    public int numberOfStopsInRoute;
    public ArrayList<Person> passengers;

    public Bus(String busDriversName, int fareCost, int numberOfStopsInRoute, ArrayList<Person> passengers) {
        this.busDriversName = busDriversName;
        this.fareCost = fareCost;
        this.numberOfWheels = numberOfStopsInRoute;
        this.passengers = passengers;
    }

    public static void main(String[] args) {
        ArrayList<Person> passengers = new ArrayList<Person>();
        Bus schoolBus = new Bus("school bus regular driver",1,10,passengers);
    }
}
