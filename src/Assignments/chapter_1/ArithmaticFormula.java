package Assignments.chapter_1;

public class ArithmaticFormula {

    public static boolean canUseArithmaticFormula(int a, int b, int c){

        if((a+b)==c||a==b-c||a*b==c){
            return true;
        }
        return false;
    }
}
