package Test;

import Chapter_1.Assignment.IsMultiple;

import java.util.Scanner;

public class IsMultipleTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value1: ");
        long value1 = input.nextLong();
        System.out.print("Enter Value2: ");
        long value2 = input.nextLong();
        boolean result = IsMultiple.isMultiple(value1,value2);

        System.out.println(value1 +" is multiple of "+value2+" ? :"+result);
    }
}
