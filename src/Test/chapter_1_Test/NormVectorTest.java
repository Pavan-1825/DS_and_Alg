package Test.chapter_1_Test;

import Assignments.chapter_1.NormVector;

import java.util.Scanner;

public class NormVectorTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter v1, v2 and p to find Euclidean norm of v \n");
        System.out.print("Enter coordinate v1 :");
        double v1 = input.nextDouble();
        System.out.print("Enter coordinate v2 :");
        double v2 = input.nextDouble();
        System.out.print("Enter p (The value of P Should be 2 or 3): ");  // p-norm(v,p) where v is coordinates of a vector and p = rootNumber is ∥v∥= 􏰑p v1p+v2p+···+vnp.
        int p = input.nextInt();
        double[] v = {v1, v2};

        //System.out.println("The Euclidean_ norm(v) of coordinates v1 , v2 is: "+ NormVector.euclideanNorm(v));
        System.out.println("The p_ norm(v) of coordinates v1 , v2 and p is ||v||: "+ NormVector.pNorm(v, p));

    }
}
