/*Question 8: Find Missing Number Using XOR Given an array containing numbers from 1 to N, but one number is missing. 
Find the missing number using XOR (without summation formula).
You are given an array of size N − 1 containing distinct integers from 1 to N, but one number is missing.
Your task is to find the missing number using XOR only (do not use summation formulas like N*(N+1)/2).
*/
import java.util.*;
public class bitManipulation_day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int[] arr = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int xorAll = 0;
        int xorArr = 0;
        // XOR all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xorAll ^= i;
        }
        // XOR all elements of the array
        for (int num : arr) {
            xorArr ^= num;
        }
        // The missing number is XOR of above two
        int missingNumber = xorAll ^ xorArr;
        System.out.println(missingNumber);
    }
}


