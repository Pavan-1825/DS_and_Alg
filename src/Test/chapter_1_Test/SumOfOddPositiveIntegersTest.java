package Test.chapter_1_Test;

import Assignments.chapter_1.SumOfOddPositiveIntegers;
import Assignments.chapter_1.SumOfPositiveIntegers;

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
