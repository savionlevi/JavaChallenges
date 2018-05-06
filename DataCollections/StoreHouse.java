package OnlineShop;

import java.util.*;

/**
 * Created by savion.levi on 5/3/2018.
 */
public class StoreHouse {

    //variables
    public String product;
    public int price;
    public int stock;
    public Map<String, Integer> listOfProducts;
    public Map<String, Integer> productsAndStock;

    //Constructor
    public StoreHouse(String product, int price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
        listOfProducts = new HashMap<String, Integer>();
        productsAndStock = new HashMap<String, Integer>();
    }

    public StoreHouse() {
        this.product="";
        this.price=0;
        this.stock=0;
        listOfProducts = new HashMap<String, Integer>();
        productsAndStock = new HashMap<String, Integer>();
    }


    //Methods

    public void addProduct(String product, int price, int stock){
        listOfProducts.put(product,price);
        productsAndStock.put(product, stock);
        setStock(stock);
    }

    public int price(String product){
        int priceOfDesiredProduct;
        priceOfDesiredProduct = this.listOfProducts.get(product);
                return priceOfDesiredProduct;
    }

    public int stock(String product) {
        return productsAndStock.get(product);

    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void take(String product) {

        if(productsAndStock.get(product)>0) {
            productsAndStock.replace(product,(productsAndStock.get(product)), (productsAndStock.get(product))-1);
        }
    }

    public static void main(String[] args) {
    StoreHouse wallMart = new StoreHouse();
    wallMart.addProduct("Milk",3,10);
    wallMart.addProduct("coffee",5,7);

    System.out.println("Prices: ");
    System.out.println("milk: "+wallMart.price("Milk"));
    System.out.println("coffee: "+wallMart.price("coffee"));

    System.out.println("stock: ");
    System.out.println("Milk: "+wallMart.stock("Milk"));
    System.out.println("coffee: "+wallMart.stock("coffee"));

    System.out.println("take stock: Milk");
    wallMart.take("Milk");
    System.out.println("Milk stock after taking: "+wallMart.stock("Milk"));

    }
}