package Test.Chapter_1.Assigments;

import Chapter_1.Assignment.IsEven;

import java.util.Scanner;

public class isEvenTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value1: ");
        int value = input.nextInt();
        if(IsEven.isEven(value)) {
            System.out.println("The value enter is " + value + " is Even");
        }else
            System.out.println("The value enter is " + value + " is Odd");
    }
}
