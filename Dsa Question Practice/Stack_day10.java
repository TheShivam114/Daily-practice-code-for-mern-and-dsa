/*You are given an array of integers heights[] where each element represents the height of a bar in a histogram.
Each bar has a fixed width of 1.
Your task is to find the area of the largest rectangle that can be formed within the boundaries of the histogram.

Input
An integer array heights[] of size n, where heights[i] represents the height of the iᵗʰ bar.
Output
Return an integer representing the maximum rectangular area possible in the histogram.
Examplea
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

public class Stack_day10 {
      public static int maxArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
  public static void main(String[] args){
    int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(heights)); // Output: 10
  }  
}


