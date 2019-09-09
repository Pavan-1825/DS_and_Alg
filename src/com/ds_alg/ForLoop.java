package com.ds_alg;

import java.util.Random;

public class ForLoop {

    //This is contains a method that find the maximum value present in an array with name of the Index

    public static int maxValue(int[] intArray){
        int total = 0;
        for(int x =0;x<intArray.length; x++){
            Random random = new Random();
            int high= 100;
            int low = 10;
            intArray[x] = random.nextInt(high-low)+low;
        }
        int maxValue = intArray[0];
        for(int j =1; j<intArray.length; j++){ // Iterating the loop from array at Index 0 to final Index
            System.out.println(intArray[j]);
                if(intArray[j]>maxValue){
                    maxValue = intArray[j];
                }
            }
        for(int values: intArray){
            total += values;
        }
        System.out.println("Sum of all Elements in intArray is :" +total);
        return maxValue;
    }


}
