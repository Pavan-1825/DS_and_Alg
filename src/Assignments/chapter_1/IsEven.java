package Assignments.chapter_1;

public class IsEven {

    public static boolean isEven(int i){
        boolean isEven = true;
        for(int x = 1; x<=i; x++){
            isEven = !isEven;
        }
        return isEven;
    }
}
