/*You are given a rectangular board of size 2 × n and an unlimited supply of rectangular tiles of size 2 × 1.
Each tile can be placed in one of two orientations:
Vertically (covering a 2 × 1 area)
Horizontally (covering a 1 × 2 area)
Task
Determine the total number of distinct ways to completely tile the 2 × n board using the given tiles.
Input
A single integer n (1 ≤ n ≤ 50)

Output
Print a single integer representing the number of ways to tile the board.
Constraints
Tiles cannot overlap.
Tiles must cover the entire board.
Rotations are allowed.

Example
Input
3
Output
3
Explanation
For n = 3, the possible tilings are:
All tiles placed vertically
One horizontal pair at the left, one vertical tile
One vertical tile, one horizontal pair at the right */
public class recursion_day8a {
    public static int tiling(int n){//2*n flore size
        //base case
        if(n==0||n==1){
            return 1;
        }
      //kaam
      //vertical
      int fnm1=tiling(n-1);
      //horizantal
      int fnm2=tiling(n-2); 
      int totalways=fnm1+fnm2;
      return totalways;
    }
    public static void main(String[] args){
         System.out.println(tiling(4  ));
    }
}
