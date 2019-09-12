package Test.chapter_1_Test;

import Assignments.chapter_1.RemovePunctuations;

import java.util.Scanner;

public class RemovePunctuationsTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the sentence :");
        String punc = input.next();

        System.out.println("Your sentance with out punctuations : " + RemovePunctuations.removePunctuations(punc));

        /*String str = punc.replaceAll("\\p{Punct}", ""); // Calling replaceAll direct method but above is own implementation
        System.out.println(str);*/

    }
}
