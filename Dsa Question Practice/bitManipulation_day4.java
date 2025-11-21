/*
 Find the Value of k-th Bit Given integers N and k, check if the k-th bit of N is set (1) or unset (0). Use:

 You are given two integers N and k.
Your task is to check whether the k-th bit (0-based index from the right) in the binary representation of N is:

1 → set

0 → unset

You must solve this using bit manipulation only, using the expression:
 */
import java.util.*;
public class bitManipulation_day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number
        int k = sc.nextInt(); 
        if ((N & (1 << k)) != 0) {
            System.out.println("Bit is set"); // 1
        } else {
            System.out.println("Bit is unset"); // 0
        }
    }
}


