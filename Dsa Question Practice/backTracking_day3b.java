/*
N-Queens Problem Using Backtracking
Objective
Design and implement a program to place N queens on an N × N chessboard such that no two queens attack each other, using the backtracking technique.
Problem Description
In the game of chess, a queen can attack another queen if it lies on the same row, same column, or same diagonal.
Given an integer N, your task is to determine all possible valid arrangements of N queens on an N × N chessboard such that:

No two queens share the same row
No two queens share the same column
No two queens share the same diagonal

The solution must be implemented using recursion with backtracking, ensuring that choices are undone when a conflict occurs.
Input
An integer N representing the size of the chessboard and the number of queens.
Output
Print all distinct valid configurations of the chessboard.
Each configuration should clearly indicate the positions of the queens.
Constraints
1 ≤ N ≤ 12
Use backtracking to explore all valid configurations.
Do not use any predefined chess or permutation libraries.
Representation
Use 'Q' to represent a queen.
Use '.' to represent an empty cell.
Example
Input:
N = 4

Output (one possible solution):
. Q . .
. . . Q
Q . . .
. . Q . 
*/
public class backTracking_day3b {
    public static void nQueens(int row)
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        nQueens(board, 0);
    }
}
