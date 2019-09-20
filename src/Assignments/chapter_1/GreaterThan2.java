package Assignments.chapter_1;


/*
 *  a Java program that can take a positive integer greater than 2 as input and
 * write out the number of times one must repeatedly divide this number by 2 before getting a value less than 2.
 * */
public class GreaterThan2 {

    int count = 0;
    double reminder = 0;


    // Takes double value as input and count the number of times that number is divisible by 2, until the reminder is < 2
    public int numberOfTimes(double input) {
        if (input > 2) {
            do {
                reminder = input / 2;
                input = reminder;
                count++;
            } while (reminder > 2);
        }
        return count;
    }
}
