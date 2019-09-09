package Assignments;

public class Product {

    public String name;

    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double reducePrice(double priceReduced){

        return price = price - priceReduced;
    }

}
