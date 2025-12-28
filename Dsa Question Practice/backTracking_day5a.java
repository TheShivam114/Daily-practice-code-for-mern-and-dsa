/*Objective
Design and implement a program to compute the total number of distinct ways to move from the top-left cell (0, 0) 
to the bottom-right cell (n−1, m−1) in an N × M grid, subject to movement constraints.
Problem Description
You are given a grid with N rows and M columns. Starting from cell (0, 0), you must reach cell (n−1, m−1) 
by making moves according to the following rules:
You may move only one step to the right (i, j+1)
Or only one step downward (i+1, j)
Your task is to determine the total number of unique paths that satisfy these conditions.

Input
Two integers N and M representing the number of rows and columns of the grid.

Output
An integer representing the total number of distinct valid paths from (0, 0) to (n−1, m−1).

Constraints
1 ≤ N, M ≤ 100
Movement is restricted to right and down directions only
The solution should use recursion, dynamic programming, or combinatorial logic

Example
Input:
N = 3, M = 3
Output:
6
 */
public class backTracking_day5a {
    public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1&&j==m-1){//condn for last cell
           return 1;
        } else if(i==n||j==n){// boundary cross condn
            return 0;
            
        }

        int w1=gridWays(i+1, j, n, m);
         int w2=gridWays(i, j+1, n, m);
          return w1+w2;
    }
    public static void main(String[] args){
       int n=3,m=3;
       System.out.println(gridWays(0, 0, n, m));
    }
}
