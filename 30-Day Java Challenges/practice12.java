/*
Recursion
Problem: Calculate Power of a Number
Difficulty

Easy

Problem Statement

Given two integers base and exponent, calculate the value of:

base
exponent

using recursion.

Function Description

Implement the function:

public static long power(int base, int exponent)
Parameters
base – The base number.
exponent – The power to which the base is raised.
Returns
The value of base raised to the power of exponent.
Input Format

The first line contains two space-separated integers:

base exponent
Output Format

Print the result of:

base^exponent
Constraints
0 ≤ exponent ≤ 30
-100 ≤ base ≤ 100
Sample Input 1
2 5
Sample Output 1
32
Explanation

Using recursion:

2^5

= 2 × 2^4
= 2 × 2 × 2^3
= 2 × 2 × 2 × 2^2
= 2 × 2 × 2 × 2 × 2^1
= 32
Sample Input 2
*/
    import java.util.Scanner;
public class practice12 {
    public static long power(int base, int exponent) {
        // Base condition
        if (exponent == 0) {
            return 1;
        }
        // Recursive call
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(power(base, exponent));
        sc.close();
    }
}

