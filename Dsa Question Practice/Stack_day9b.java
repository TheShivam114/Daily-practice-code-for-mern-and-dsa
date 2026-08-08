/*You are given an array of integers heights[] where each element represents the height of a bar in a histogram.
Each bar has a fixed width of 1.
Your task is to find the area of the largest rectangle that can be formed within the boundaries of the histogram.

Input
An integer array heights[] of size n, where heights[i] represents the height of the iᵗʰ bar.
Output
Return an integer representing the maximum rectangular area possible in the histogram.
Example
Input
heights = [2, 1, 5, 6, 2, 3]
Output
10
Explanation
The largest rectangle can be formed using bars of height 5 and 6, spanning a width of 2.
Area = 5 × 2 = 10
Constraints
1 ≤ n ≤ 10⁵
0 ≤ heights[i] ≤ 10⁴
Expected Approach
Use a stack-based algorithm to efficiently compute the nearest smaller bar to the left and right for each bar.
Time Complexity: O(n)
Space Complexity: O(n)
Notes
Each bar can act as the smallest height in a rectangle.
The rectangle width is determined by how far the bar can extend left and right before encountering a smaller height. */
import java.util.*;

public class Stack_day9b {
     public static int maxArea(int[] heights){
         Stack<Integer> stack = new Stack<>();
        
     }
  public static void main(String[] args){
    int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(heights)); // Output: 10
  }  
}
