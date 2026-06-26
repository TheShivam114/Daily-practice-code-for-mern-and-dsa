/*
Calculator – Square Root
Problem Statement

Write a Calculator class with a single method:

int squareRoot(int n)

The squareRoot method takes one integer n as a parameter and returns the integer square root of n.

If n is negative, the method must throw an exception with the message:

Number should be non-negative

Note: Do not use an access modifier (e.g., public) in the declaration of your Calculator class.

Input Format

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

Constraints
-1000 ≤ n ≤ 1000
Output Format

For each test case:

Print the integer square root if n is non-negative.
Otherwise, print:
Number should be non-negative
Sample Input
5
25
64
81
-9
0
Sample Output
5
8
9
Number should be non-negative
0
Explanation
√25 = 5
√64 = 8
√81 = 9
-9 is negative, so an exception is thrown.
√0 = 0
Method Signature
class Calculator {
    int squareRoot(int n) throws Exception
}
*/
    import java.util.Scanner;

class Calculator {

    int squareRoot(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Number should be non-negative");
        }
        return (int) Math.sqrt(n);
    }
}

public class day22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        Calculator calculator = new Calculator();

        while (T-- > 0) {
            int n = sc.nextInt();

            try {
                System.out.println(calculator.squareRoot(n));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}

