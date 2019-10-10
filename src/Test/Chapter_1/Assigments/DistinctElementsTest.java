package Test.Chapter_1.Assigments;

import Chapter_1.Assignment.DistinctElements;

/*
 * a Java method that takes an array of float values and determines if all the numbers are different from each other (that is, they are distinct).
 * */
public class DistinctElementsTest {

    public static void main(String[] args){

        float[] distinctElements = {1,3,46,466,6,57,2,57,38,95};
        DistinctElements elements = new DistinctElements();

        System.out.print("The elements in the Array are distinct?: " +elements.isDistinctElements(distinctElements));
    }
}
