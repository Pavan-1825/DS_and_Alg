package Test;

import Chapter_1.Product;

public class ProductPrinter {

    public static void main(String[] args){
        Product product1 = new Product("Test1",24.45);
        Product product2 = new Product("Test1",28.343);

        System.out.println("Product1_Details:  "+"name: "+product1.getName()+",Given_price: "+product1.getPrice()+", reducePrice: "+product1.reducePrice(5.0));
        System.out.println("Product2_Details:  "+"name: "+product2.getName()+", Given_price: "+product2.getPrice()+", reducePrice: "+product2.reducePrice(5.0));
    }
}
