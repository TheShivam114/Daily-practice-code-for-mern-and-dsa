/*You are given a partially filled 9 × 9 Sudoku board where empty cells are represented by 0.
Your task is to complete the Sudoku puzzle by filling in the empty cells such that the final board satisfies all the rules of Sudoku.

Sudoku Rules
A valid Sudoku solution must satisfy the following constraints:
Row Constraint:
Each digit from 1 to 9 must appear exactly once in every row.
Column Constraint:
Each digit from 1 to 9 must appear exactly once in every column.
3 × 3 Subgrid Constraint:
Each digit from 1 to 9 must appear exactly once in each of the nine 3 × 3 subgrids.

Input Format
A 2D integer array sudoku[9][9]
0 represents an empty cell that needs to be filled.
All filled cells contain values from 1 to 9.
Output Format
If a valid Sudoku solution exists, print the completed Sudoku board.
If no solution exists, print:
No solution exists
Constraints
sudoku.length = 9
sudoku[i].length = 9
0 ≤ sudoku[i][j] ≤ 9
The input Sudoku puzzle is guaranteed to have at most one valid solution.
Requirements
Solve the problem using Backtracking.
Implement a helper function to check whether placing a digit at a given position is safe.
Modify the Sudoku board in-place.

                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }*/
public class backTracking_day7 {
    public static boolean isSafe(int sudoku[][],int row,int col, int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;

            }

        }
        //row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;

            }

        }
        //grid  
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3*3
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
     //base case
     if(row==9){
        return true;

     }
      
     //recusion
     int nextRow=row,nextCol=col+1;
     if(col+1==9){
        nextRow=row+1;
        nextCol=0;
     }

     if(sudoku[row][col] !=0){
        return sudokuSolver(sudoku, nextRow, nextCol);
     }

     for(int digit=1; digit<=9;digit++){
        if(isSafe(sudoku, row, col, digit)){
            sudoku[row][col]=digit;
           if( sudokuSolver(sudoku,nextRow,nextCol)){//soln exists
                return true;
            }
            sudoku[row][col]=0;
        }
     }
     return false;
    }

   public static void printSudoku(int sudoku[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
   }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

      if(  sudokuSolver(sudoku, 0, 0)){
        System.out.println("solution exists");
        printSudoku(sudoku);
      }
      else{
        System.out.println("not exists");
      }
    }

}
