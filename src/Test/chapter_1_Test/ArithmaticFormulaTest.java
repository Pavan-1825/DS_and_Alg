package Test.chapter_1_Test;

import Assignments.chapter_1.ArithmaticFormula;

import java.util.Scanner;

public class ArithmaticFormulaTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Check your three number's will satisfy One of this Arithmatic Formula (a+b)=c, a=(b-c), (a*b)=c");
        System.out.print("Enter num_1 :");
        int a = input.nextInt();
        System.out.print("Enter num_2 :");
        int b = input.nextInt();
        System.out.print("Enter num_3 :");
        int c = input.nextInt();
        System.out.println(ArithmaticFormula.canUseArithmaticFormula(a,b,c));
    }
}
