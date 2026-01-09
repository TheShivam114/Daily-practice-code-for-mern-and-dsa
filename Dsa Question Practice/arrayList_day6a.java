/*
Check for a Pair with Given Target Sum in a Sorted ArrayList
Objective
Write a Java program to determine whether any pair of elements in a sorted ArrayList<Integer> sums up to a given target value.
Description
You are given a sorted ArrayList<Integer> containing integers in ascending order and an integer value target. Your task is to check whether there exists at least one pair (i, j) such that:

list[i]+list[j]=target,i not=j
If such a pair exists, print true; otherwise, print false.
Input
A sorted ArrayList<Integer>
An integer target
Sample Input:
List = [1, 2, 3, 4, 5, 6]
Target = 5

Output
true if a valid pair exists
false otherwise
Sample Output:
true
(Explanation: 1 + 4 = 5 or 2 + 3 = 5)
Requirements
Use ArrayList<Integer> from the Java Collections Framework.
Do not modify the input list.
Do not use nested loops (brute-force approach).
Implement the solution using the two-pointer technique.
Ensure optimal time complexity.
Constraints
2 ≤ size of ArrayList ≤ 10⁵
−10⁶ ≤ elements ≤ 10⁶
ArrayList is already sorted in ascending order
Concepts Tested
Java Collections Framework
Two-pointer technique
Searching in sorted data
Time and space complexity analysis
Expected Time Complexity
O(n)
Expected Space Complexity
O(1) */

import java.util.ArrayList;

public class arrayList_day6a {
    // public static boolean pairsum(ArrayList<Integer>list,int target){
    //   for(int i=0;i<list.size();i++){
    //     for(int j=i+1;j<list.size();j++){
    //         if(list.get(i)+list.get(j)==target){
    //             return true;
    //         }

    //     }
       
    //   }
    //    return false;
    // }

    //two pointer aproch
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }

            
        }
        return false;
    }
 public static void main(String[] args){
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
      int target=5;
      System.out.println(pairsum(list, target));

 }  

}
