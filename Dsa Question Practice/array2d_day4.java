/*
 Question: Search in a Sorted 2D Matrix

You are given an integer matrix matrix[][] of size n × m,
where each row and each column is sorted in ascending order.

Your task is to find whether a given target element exists in the matrix.

If the target exists, print its position (row and column index).
If it does not exist, print "Element not found".

Matrix Properties

1.Each row is sorted from left to right.

2.Each column is sorted from top to bottom.


int matrix[][] = {
    {10, 20, 30, 40},
    {15, 25, 35, 45},
    {27, 29, 37, 48},
    {32, 33, 39, 50}
};


 */


public class array2d_day4 {
   
        public static int diagonalSum(int[][] matrix) {
            int n = matrix.length;
            if (n == 0 || matrix[0].length != n) {
                throw new IllegalArgumentException("matrix must be non-empty and square (n x n)");
            }

            int sum = 0; 
            for (int i = 0; i < n; i++) {
                // primary diagonal element
                sum += matrix[i][i];

                int j = n - 1 - i;
                if (i != j) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            int arr[][] = {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 }
            };

            System.out.println(diagonalSum(arr)); // prints 68
        }
    

}
