/*Objective

Write a Java program to determine the maximum amount of water that can be stored between two vertical lines represented by an ArrayList of integers.
Description
You are given an ArrayList<Integer> where each element represents the height of a vertical line drawn on the x-axis. The distance between consecutive lines is 1 unit.
 Choose any two lines such that together with the x-axis they form a container that can store the maximum amount of water.
The amount of water stored between two lines is calculated as:

Water=min(height[left],height[right])×(right−left)
Your task is to find and return the maximum water that can be stored.

Input
An ArrayList<Integer> containing heights of vertical lines.
Sample Input:
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output
An integer representing the maximum area of water that can be stored
Sample Output:
Maximum Water = 49
Requirements
Use ArrayList<Integer> to store the heights.
Do not use brute-force nested loops.
Implement the solution using the two-pointer technique.
Do not modify the input list.
Optimize the solution for time efficiency.
Constraints
2 ≤ size of ArrayList ≤ 10⁵
0 ≤ height[i] ≤ 10⁴
Heights are non-negative integers
Concepts Tested
Java Collections Framework (ArrayList)
Two-pointer technique
Greedy approach
Optimization over brute force
Mathematical reasoning
Expected Time Complexity
O(n)
Expected Space Complexity
O(1) (excluding input list) */

import java.util.ArrayList;

public class arrayList_day5a {
    public static int maxWater(ArrayList<Integer> height) {
        //brute fore
         int maxWater=0;
         for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int area=ht*width;
                maxWater=Math.max(maxWater, area);
            }
         }
         return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result = maxWater(height);
        System.out.println("Maximum Water = " + result);
    }

}
