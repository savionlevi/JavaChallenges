package Car_Inheritence;

/**
 * Created by savion.levi on 3/27/2018.
 */
public class BMW extends Car{

    public String bmwFactorysCountry;
    public boolean hasNitro;

    public BMW(String bmwFactorysCountry, boolean hasNitro) {
        this.bmwFactorysCountry = bmwFactorysCountry;
        this.hasNitro = hasNitro;
    }

    public void injectNitro(int amount) {
    this.horsePower = horsePower*(amount/20);
        System.out.println("adding NOS, new HP: ");
        printHorsePower();
    }

    public static void main(String[] args) {
    BMW M5 = new BMW("Germany",true);
    M5.setHorsePower(500);

    System.out.println(M5.toString());
    M5.injectNitro(50);

    }
}
