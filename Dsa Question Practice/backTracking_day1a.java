/*Problem Statement: Array Value Assignment Using Backtracking:

Write a Java program that uses recursion and backtracking to perform the following task:
Create an integer array of size N.
 
Starting from index 0, assign values to the array such that:
The value at index i is assigned starting from 1 and increases by 1 for each subsequent index.
Once the array is completely filled, print the array.
While returning from recursive calls, apply backtracking by subtracting 2 from each element at its respective index.
After all recursive calls complete, print the final state of the array.

Input
An integer N representing the size of the array.
Output
Print the array after all values are assigned (during recursion).
Print the array after backtracking is completed (after recursion ends).
Constraints
1 ≤ N ≤ 100

Use recursion only (no loops for filling the array).
Backtracking must be explicitly implemented.
Example
Input:
N = 5
Output:
1 2 3 4 5
-1 0 1 2 3 */

public class backTracking_day1a {
    public static void checkarr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //kaam
        arr[i]=val;
        checkarr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
       
    }
    
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]=new int[5];
        checkarr(arr,0,1);
         printarr(arr);
    }
}
