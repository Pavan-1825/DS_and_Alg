package Assignments.chapter_1;

public class NormVector {

    /*
    ∥v∥= 􏰑p v1p+v2p+···+vnp.
    Euclidean norm
    */
    // Time Complexity of this p-norm ||v|| is O(n
    public static double pNorm(double[] vect, int p) {
        double sum = 0, vResult = 1;

        double i = 1;
        double l = 1;
        for (int x = 0; x <= vect.length - 1; x++) {

            double y = vect[x];
            double rootValue = y * y;

            if (p > 2) {
                for (int m = 3; m <= p; m++) {
                    rootValue = rootValue * y;
                }
            }
            sum = sum + rootValue;
        }
        if (sum == 0 || sum == 1) {
            return sum;
        }
        if (p == 2) {
            return Math.sqrt(sum);
        } else
            return Math.cbrt(sum);

    }

    //Euclidean_norm(v) where p =2(SquareRoot)
    public static int euclideanNorm(int[] v) {

        int v1 = v[0];
        int v2 = v[1];
        int squareV = v1 * v1 + v2 * v2;
        int i = 1, vResult = 1;
        if (squareV == 0 || squareV == 1) {
            return squareV;
        }
        while (vResult <= squareV) {
            i++;
            vResult = i * i;
        }
        return i - 1;
    }
}

