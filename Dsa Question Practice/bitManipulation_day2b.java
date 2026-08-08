/*Medium-Level Bit Manipulation Question
 Question: Count Number of Set Bits in an Integer

Write a Java program to count how many bits are set to 1 in the binary representation of a given integer N, 
using only bit manipulation, specifically the operation:
n = n & (n - 1)

Requirements

Do not use built-in functions like Integer.bitCount().

Use a loop and the bit manipulation trick:

n = n & (n - 1)
 */import java.util.*;
public class bitManipulation_day2b {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            n = n & (n - 1); // removes the rightmost set bit
            count++;
        }

        System.out.println(count);
    }
}


