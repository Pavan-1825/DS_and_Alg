package Test.chapter_1_Test;

import Assignments.chapter_1.IsEven;

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
