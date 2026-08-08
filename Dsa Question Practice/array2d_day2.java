/*
 Given a 2D integer array arr[][] of size n x m, print all elements in spiral order starting from the top-left corner and moving clockwise inward.

Spiral order means:

*Traverse the top row from left → right,

*Then traverse the right column from top → bottom,

*Then the bottom row from right → left,

*Then the left column from bottom → top,

*Then repeat the above on the remaining inner submatrix until all elements are printed.


Input / Output format

Input:

A 2D array arr[][] (you may be given n and m, or the array directly).

Output:

Print the elements in a single line (or one per line) in spiral order separated by spaces.

Example output style:

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


int arr[][] = {
  { 1,  2,  3,  4},
  { 5,  6,  7,  8},
  { 9, 10, 11, 12},
  {13, 14, 15, 16}
};

 */
public class array2d_day2 {
    public static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j-- ){
                if(startRow==endRow){
                    break;
                }
                 System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(endCol==startCol){
                    break;
                }
                 System.out.print(matrix[i][startCol]+" ");
             }
            

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        spiralMatrix(arr);

    }
}
