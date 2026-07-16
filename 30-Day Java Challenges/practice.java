/*
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

Function Description
Complete the bitwiseAnd function in the editor below.

bitwiseAnd has the following paramter(s):
- int N: the maximum integer to consider
- int K: the limit of the result, inclusive

Returns
- int: the maximum value of  within the limit.

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.

Constraints

Sample Input

STDIN   Function
-----   --------
3       T = 3
5 2     N = 5, K = 2
8 5     N = 8, K = 5
2 2     N = 2, K = 2
Sample Output

1
4
0
Explanation

 

All possible values of  and  are:

The maximum possible value of  that is also  is , so we print  on a new line.
*/
    import java.util.*;

public class practice  {

    public static void bitwiseAnd(int N, int K) {

        int max = 0;

        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {

                int value = A & B;

                if (value < K && value > max) {
                    max = value;
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            bitwiseAnd(N, K);
        }

        sc.close();
    }
}

