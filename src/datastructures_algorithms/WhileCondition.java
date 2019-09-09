package datastructures_algorithms;

import java.util.Random;

public class WhileCondition {

    int[] array = new int[5];

    public void whileCondition(){

        int j = 1;
        array[0] = 10;
        array[1] = 11;
        array[2] = 12;
        array[3] = 34;
        array[4] = 4;
        int target = 34;
        int targetIndex;
        while(j<array.length && array[j] != target){

            System.out.println(array[j]+" Not Equals to Target Element:"+target);
            j++;
            if(array[j]==target){
                System.out.println("Value at the targetIndex is: "+array[j]+"\nIndex of Target value is :" +j);
            }
        }
    }
}
