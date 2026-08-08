/*
Check if Two Numbers Have the Same Sign

You are given two integers A and B.
Your task is to check whether both numbers have the same sign using bit manipulation only.

You must use the XOR operator:
A ^ B

Hint:
If A and B have different signs, the result of A ^ B will have its sign bit = 1 (negative number).
If they have same signs, A ^ B will be positive.

📥 Example Inputs
Example 1
A = 5
B = 9

Both are positive → same sign.
Example 2
A = -4
B = 6

 */
import java.util.*;
public class bitManipulation_day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // XOR the two numbers
        int xorValue = A ^ B;
        //  negative → sign bits are different
        if (xorValue < 0) {
            System.out.println("Different Sign");
        } else {
            System.out.println("Same Sign");
        }
    }
}


