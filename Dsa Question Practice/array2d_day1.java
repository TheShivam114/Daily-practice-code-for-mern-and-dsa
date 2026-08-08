/*You are given a 2D integer array matrix[][] of size n x m,
where each row and each column is sorted in ascending order.

Your task is to find whether a given target element x exists in the matrix.
If it exists, print its position (row and column index), otherwise print “Not Found”.

matrix = [
    [10, 20, 30, 40],
    [15, 25, 35, 45],
    [27, 29, 37, 48],
    [32, 33, 39, 50]
]
x = 29


Element found at (2, 1)

 */
import java.util.Scanner;
public class array2d_day1 {
    public static boolean searchElement(int metrix[][],int key){
          for(int i=0;i<metrix.length;i++){
            for(int j=0;j<metrix[0].length;j++){
                if(metrix[i][j]==key){
                    System.out.println("element fount "+"("+i+","+j+")");
                    return true;
                }
            }
          }
          
          System.out.println(" not found ");
          return false;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int metrix[][]=new int[3][3];
int n=metrix.length,m=metrix[0].length;
System.out.println("enter element of matrix:");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        metrix[i][j]=sc.nextInt();
    }
}
System.out.println("element are:");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(metrix[i][j]+" ");
    }
    System.out.println();

}
   int a=5;
    searchElement(metrix,a);
}
}