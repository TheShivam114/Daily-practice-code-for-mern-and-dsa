/*
 Multiply a Number by 2 Using Left Shift

You are given an integer N.
Your task is to multiply the number by 2 using bit manipulation only, without using the * operator.

You must use the left shift operator:
 */
import java.util.*;
public class bitManipulation_day5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Multiply N by 2 using left shift
        int result = N << 1;

        System.out.println(result);
    }
}


