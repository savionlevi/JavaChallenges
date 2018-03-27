package Car_Inheritence;

/**
 * Created by savion.levi on 3/27/2018.
 */
public class Vehicle {

    public int numberOfWheels;
    public int horsePower;
    public int weight;
    public int yearOfManufacture;

    public Vehicle(int numberOfWheels, int horsePower, int weight, int yearOfManufacture) {
        this.numberOfWheels = numberOfWheels;
        this.horsePower = horsePower;
        this.weight = weight;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle(){
        this.numberOfWheels=4;
        this.horsePower=50;
        this.weight=500;
        this.yearOfManufacture=2000;
    }

    public void printHorsePower(){
        System.out.println("HorsePower: "+this.horsePower);
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String toString(){

        return "vehicle info: Wheels-"+this.numberOfWheels+" , HP-"+this.horsePower+" , Weight-"+this.weight+" , year of manufacture-"+this.yearOfManufacture;
    }

    public static void main(String[] args) {
        Vehicle prototype = new Vehicle(4,100,1000,2000);
        System.out.println(prototype.toString());
    }
}
