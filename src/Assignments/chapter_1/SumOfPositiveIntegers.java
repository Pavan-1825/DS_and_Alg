package Assignments.chapter_1;

public class SumOfPositiveIntegers {

    public static int sumOfAllPositiveIntegers(int n) {

        int sum = 0;
        for (int x = 0; x <= n; x++) {
            sum = sum + x;
        }
        return sum;
    }
}
