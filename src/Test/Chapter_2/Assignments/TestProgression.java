package Test.Chapter_2.Assignments;

import Chapter_2.ArithmaticProgression;
import Chapter_2.FibonacciProgression;
import Chapter_2.GeometricProgression;
import Chapter_2.Progression;

public class TestProgression {

    public static void main(String[] args){

        Progression prog;

        //Arithmatic progression Class Test
        System.out.print("Arithmatic Progression with default increment : ");
        prog = new ArithmaticProgression();
        prog.printProgression(10);

        System.out.print("Arithmatic Progression with increment 5 :");
        prog = new ArithmaticProgression(5);
        prog.printProgression(10);

        System.out.print("Arithmatic Progression with  start 2 :");
        prog = new ArithmaticProgression(5,2);
        prog.printProgression(10);

        //Geometric Progression Class Test
        System.out.print("Geomatric Progression with default base :");
        prog = new GeometricProgression();
        prog.printProgression(10);

        System.out.print("Geomatric Progression with  base 3 :");
        prog = new GeometricProgression(3);
        prog.printProgression(10);

        //Fibonacci Progression Class Test
        System.out.print("Fibonacci Progression with default values :");
        prog = new FibonacciProgression();
        prog.printProgression(10);

        System.out.print("Fibonacci Progression start and  :");
        prog = new FibonacciProgression(2,4);
        prog.printProgression(8);

    }
}
