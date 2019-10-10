package Test.Chapter_1.Assigments;

import Chapter_1.Assignment.SumOfOddPositiveIntegers;

import java.util.Scanner;

public class SumOfOddPositiveIntegersTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter Your Number: ");
        int n = input.nextInt();

        if(n>0){

            System.out.println("The Sum of All Odd number's of Integer "+n+" is : "+ SumOfOddPositiveIntegers.sumOfOddPositiveIntegers(n));
        }

    }
}
