package Test;

public class Arrays {

    public static void main(String [] args){

        int [] intArrays = new int[7];

        intArrays[0] = 20;
        intArrays[1] = 70;
        intArrays[2] = 0;
        intArrays[3] = -23;
        intArrays[4] = -83;
        intArrays[5] = 26;
        intArrays[6] = 34;

        for( int i =0; i<intArrays.length;i++){
            System.out.println(intArrays[i]);
        }

    }
}
