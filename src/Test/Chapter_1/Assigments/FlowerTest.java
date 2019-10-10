package Test.Chapter_1.Assigments;

import Chapter_1.Assignment.Flower;

public class FlowerTest {

    public static void main(String[] args){
        Flower flower = new Flower("Rose", 23, 3);
        Flower flower1 = new Flower();
        flower1.setName("Jasmine");
        flower1.setNumberOfPetals(5);
        flower1.setPrice(3);

        System.out.println(flower);
    }
}
