package Assignments.chapter_1;

/* We know,
(k + 1)3 = k3 + 3 * k2 + 3 * k + 1
We can write the above identity for k from 1 to n:
23 = 13 + 3 * 12 + 3 * 1 + 1 ......... (1)
33 = 23 + 3 * 22 + 3 * 2 + 1 ......... (2)
43 = 33 + 3 * 32 + 3 * 3 + 1 ......... (3)
53 = 43 + 3 * 42 + 3 * 4 + 1 ......... (4)
...
n3 = (n - 1)3 + 3 * (n - 1)2 + 3 * (n - 1) + 1 ......... (n - 1)
(n + 1)3 = n3 + 3 * n2 + 3 * n + 1 ......... (n)

Putting equation (n - 1) in equation n,
(n + 1)3 = (n - 1)3 + 3 * (n - 1)2 + 3 * (n - 1) + 1 + 3 * n2 + 3 * n + 1
         = (n - 1)3 + 3 * (n2 + (n - 1)2) + 3 * ( n + (n - 1) ) + 1 + 1

By putting all equation, we get
(n + 1)3 = 13 + 3 * Σ k2 + 3 * Σ k + Σ 1
n3 + 3 * n2 + 3 * n + 1 = 1 + 3 * Σ k2 + 3 * (n * (n + 1))/2 + n
n3 + 3 * n2 + 3 * n = 3 * Σ k2 + 3 * (n * (n + 1))/2 + n
n3 + 3 * n2 + 2 * n - 3 * (n * (n + 1))/2 = 3 * Σ k2
n * (n2 + 3 * n + 2) - 3 * (n * (n + 1))/2 = 3 * Σ k2
n * (n + 1) * (n + 2) - 3 * (n * (n + 1))/2 = 3 * Σ k2
n * (n + 1) * (n + 2 - 3/2) = 3 * Σ k2
n * (n + 1) * (2 * n + 1)/2  = 3 * Σ k2
n * (n + 1) * (2 * n + 1)/6  = Σ k2  */
public class SumOfSquareRootNum {

    //Approch1: Time Complexity = O(n)
    public static int sumOfSquares1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Approch2: Time Complexity= O(1)-->Best solution
    public static int sumOfSquares2(int n) {

        return (n * (n + 1) / 2) * (2 * n + 1) / 3;
    }
}
