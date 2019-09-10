package Assignments.chapter_1;

public class SumOfOddPositiveIntegers {

    public static int sumOfOddPositiveIntegers(int n){

        int sumOfOdd = 0;

        for(int i = 1; i<=n; i++) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }
        }
        return sumOfOdd;
    }
}
