package Assignments.chapter_1;

import java.util.Scanner;

public class BaseTypes {

    public void inputAllBaseTypes(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Byte Value: ");
        byte b = input.nextByte();

        System.out.print("Enter a Integer Value: ");
        int i = input.nextInt();

        System.out.print("Enter a Long Value: ");
        long l = input.nextLong();

        System.out.print("Enter a float Value: ");
        float f = input.nextFloat();

        System.out.print("Enter a double Value: ");
        double d = input.nextDouble();

        System.out.print("Enter a String Value: ");
        String string = input.next();

        System.out.print("Enter a Boolean Value: ");
        boolean bol = input.nextBoolean();


        System.out.println("All input Base Types values: \n"+"byte: "+b+"\nint: "+i+"\nlong: "+l+"\nfloat: "+f+"\ndouble: "+d+"\nString: "+string+"\nboolean: "+bol);

    }
}
