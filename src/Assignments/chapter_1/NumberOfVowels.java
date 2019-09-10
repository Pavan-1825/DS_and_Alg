package Assignments.chapter_1;

public class NumberOfVowels {


    public static void stringVowels(String n) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int sum = 0;
        System.out.print("vowels in a given string "+ "\""+n +"\""+" is: ");

        for (int x = 0; x < n.length(); x++) {
            char temp = n.charAt(x);
            for (int y = 0; y < vowels.length; y++) {
                if (temp == vowels[y]) {
                    sum += 1;
                    System.out.print(temp+",");
                }
            }
        }
        System.out.println("\nTotal number of vowels in a given string :" + sum);
    }

}
