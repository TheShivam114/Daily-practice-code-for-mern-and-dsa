/*Check if a Number is a Power of 2

You are given an integer N.
Your task is to determine whether N is a power of 2 or not, using bit manipulation only.

A number is a power of 2 if it has exactly one set bit in its binary representation.
(Examples: 1, 2, 4, 8, 16…)

Input Format

A single integer N

Output Format

Print:

false 
true  */
public class bitManipulation_day9a {
      public static boolean ispower(int n){
        return (n&(n-1))==0;
      }
    public static void main(String[] args){
       System.out.println(ispower(5)); 
       System.out.println(ispower(4)); 
    }
}
