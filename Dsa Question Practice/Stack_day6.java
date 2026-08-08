/*
Given an integer array arr[] of size N, the Next Greater Element (NGE) for an element arr[i] is defined 
as the first element greater than arr[i] that appears to the right of i in the array.
If no such element exists, the next greater element for that position should be -1.
Task
Write a program to find the next greater element for every element in the array using a stack-based approach.
Input
An integer N representing the number of elements
An integer array arr[] of size N
Output
An integer array nge[] of size N, where nge[i] is the next greater element of arr[i]
Example
Input:
N = 5
arr = [6, 8, 0, 1, 3]
Output:
nge = [8, -1, 1, 3, -1]
Explanation
Next greater element of 6 is 8
No element greater than 8 exists to its right → -1
Next greater element of 0 is 1
Next greater element of 1 is 3
No greater element exists for 3 → -1
Constraints
1 ≤ N ≤ 10^5
-10^6 ≤ arr[i] ≤ 10^6
Expected Time Complexity
O(N)
Expected Space Complexity
O(N) (for stack usage)
*/
import java.util.*;
public class Stack_day6 {

    public static void main(String[] args){
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int [arr.length];
        for(int i=arr.length-1;i>0;i--){
            //1while
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2if-else
                if(s.isEmpty()){
                    nxtGreater[i]=-1;
                }
                else{
                    nxtGreater[i]=arr[s.peek()];
                }
                //3push in s
                s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
    }
}