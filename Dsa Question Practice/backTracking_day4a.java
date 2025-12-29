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
public class backTracking_day4a {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diag left up
        for (int i=row-1,j=col-1;i>= 0&&j>=0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void nQueens( char board[][],int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){//check is any queen set or not return 0,1
                 board[row][j]='Q';
            nQueens(board, row+1);//function cll
            board[row][j]='X';//to remove j,backTracking call;
            }
        }

    }
    public static void printBoard(char board[][]){
        System.out.println("------chess board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int n=5;
       char board [][]=new char[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='X';
        }
       }

        nQueens(board, 0);
    }
}
