/*
 Bit Manipulation Question: Check if a Number is Odd or Even
Question

Write a Java program to check whether a given integer N is odd or even using bit manipulation only (do NOT use %, /, or * operators).

You must use the bitwise AND operator:
N & 1
Input:
An integer N.
Output
Print:
"Even" if the number is even
"Odd" if the number is odd
Example 1

Input:10
Output:Even

Example 2

Input:7
Output:Odd
 */
public class bitManipulation_day2a {
    public static void oddOrEven(int n)
    {
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println(n+":"+" Number is Even");
        }
        else{
              //n&bitwise==1;
              System.out.println(n+":"+" Number is Odd");
        }
    }
    public static void main(String[] args){
            oddOrEven(10);
            oddOrEven(7);
    }
}
