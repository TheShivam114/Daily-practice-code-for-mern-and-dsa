/*
Maximum Bitwise OR (Easy)

Given two integers A and B (A < B) from the set {1, 2, ..., N}, find the maximum value of:

A | B

where | is the bitwise OR operator.

Input
N = 5
Output
7

Explanation

Possible pairs:

1 | 2 = 3
1 | 3 = 3
1 | 4 = 5
1 | 5 = 5
2 | 3 = 3
2 | 4 = 6
2 | 5 = 7
3 | 4 = 7
3 | 5 = 7
4 | 5 = 5

Maximum = 7
*/

/**
 * practice1
 */
    import java.util.Scanner;

public class practice1 {

    public static int maximumBitwiseOR(int N) {
        int max = 0;

        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {

                int value = A | B;

                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(maximumBitwiseOR(N));

        sc.close();
    }
}
