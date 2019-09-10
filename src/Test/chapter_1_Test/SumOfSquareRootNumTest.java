package Test.chapter_1_Test;

import Assignments.chapter_1.SumOfSquareRootNum;

import java.util.Scanner;

public class SumOfSquareRootNumTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = input.nextInt();

        System.out.println("Method_1 Answer :" + SumOfSquareRootNum.sumOfSquares1(num));
        System.out.println("Method_2 Answer :" + SumOfSquareRootNum.sumOfSquares2(num));

        // Logic to find the number's that are square root of itself for integer n, eg: 1, 4, 9 are Square root of itself for given number 11
        /*for (int x = 1; x <= i; x++) {
            for (int y = 1; y <= i; y++) {
                if (y * y == x) {
                    System.out.print(x+"\n");
                    sum += x;
                }
            }
        }
        System.out.println("\n sum of all: "+sum);*/
    }
}
