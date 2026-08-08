/*
 You are given a square 2D integer array matrix[][] of size n × n.
Your task is to find and print the sum of both the primary and secondary diagonals.

🔹 Definition:

The primary diagonal (main diagonal) consists of elements where row index = column index.
→ matrix[...][...]

The secondary diagonal consists of elements where row index + column index = ......
→ matrix[....][....]

 */
public class array2d_day3 {
    public static int diagonal(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //best approach
       for(int i=0;i<matrix.length;i++){
        
            sum += matrix[i][i];
           if(i!=matrix.length-1-i)
           sum +=matrix[i] [matrix.length-1-i];
       }
        return sum;
    }
    public static void main(String[] args){
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
                System.out.println(diagonal(arr));
        
    }
}
