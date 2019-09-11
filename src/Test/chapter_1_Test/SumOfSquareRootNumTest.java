package Test.chapter_1_Test;

import Assignments.chapter_1.SumOfSquareRootNum;

import java.util.Scanner;

public class SumOfSquareRootNumTest {

    public static void main(String[] args) {

        int sum = 0;
        boolean isTrue = true;
        int start = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = input.nextInt();

        System.out.println("Method_1 Answer :" + SumOfSquareRootNum.sumOfSquares1(num));
        System.out.println("Method_2 Answer :" + SumOfSquareRootNum.sumOfSquares2(num));

        // Logic to find the number's that are square root of itself for integer n, eg: 1, 4, 9 are Square root of itself for given number 11
       /* while(start*start<num){
            int squareValues = start*start;
             System.out.println(squareValues);
              sum += squareValues;
            start++;
        }
        System.out.println("\n sum of all: "+sum);*/
    }
}
