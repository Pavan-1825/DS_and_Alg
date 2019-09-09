package Test;

import com.ds_alg.TakeUserInput;

import java.util.Scanner;

public class TakeUserInputTest {

    public static void main(String [] args){

        TakeUserInput takeUserInput;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name :");
        while (!input.hasNext()){
            System.out.println("Enter your Name in Aphabatics:");
            input.nextLine();
        }
        String name = input.nextLine();
        System.out.println("Enter Your Age :");

        while (!input.hasNextInt()){
            System.out.println("Please Enter your Age In Integer :");
            input.nextLine();
        }
        int age = input.nextInt();

        takeUserInput = new TakeUserInput(name,age);

        System.out.println("Name: " + takeUserInput.getName() +"\nAge: " + takeUserInput.getAge());
    }
}
