package Test.chapter_1_Test;

import Assignments.chapter_1.SumOfPositiveIntegers;

import java.util.Scanner;

public class SumOfPositiveIntegersTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = input.nextInt();
        if(n>0) {
            System.out.println("Sum of All positive integer of " + n + " is :" + SumOfPositiveIntegers.sumOfAllPositiveIntegers(n));
        }
    }
}
