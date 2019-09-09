package Test.chapter_1_Test;

import Assignments.chapter_1.GameEntry;

public class GameEntryTest {


    // this will throw nullPointerException
    public static void main(String[] args) {

        GameEntry[] A = new GameEntry[6];
        A[0] = new GameEntry(300);
        A[1] = new GameEntry(400);
        A[2] = new GameEntry(450);
        A[3] = new GameEntry(500);
        A[4] = new GameEntry(500);
        A[5] = new GameEntry(600);
        GameEntry[] B = new GameEntry[A.length];
        for (int x = 0; x < A.length; x++) {
            B[x] = A[x];
            if(x == 4){
                A[x]= new GameEntry(550);
                B[x]=A[x];
                System.out.println(B[x].toString());
            }
        }
    }
}
