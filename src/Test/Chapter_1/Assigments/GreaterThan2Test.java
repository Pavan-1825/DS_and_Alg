package Test.Chapter_1.Assigments;

import Chapter_1.Assignment.GreaterThan2;

import java.util.Scanner;

public class GreaterThan2Test {

    public static void main(String[] args){

        GreaterThan2 greaterThan2 = new GreaterThan2();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number greater than 2: ");
        double number = input.nextDouble();
        System.out.println("The Number of time's "+number+" divisible by 2 is :"+greaterThan2.numberOfTimes(number));
    }
}
