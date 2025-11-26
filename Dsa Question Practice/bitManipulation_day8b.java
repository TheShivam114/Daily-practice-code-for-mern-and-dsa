/*
You are given an integer N, and two integers L and R (0-indexed), where
0 ≤ L ≤ R ≤ 31.
Your task is to clear all bits from position L to R in N (both inclusive), and output the resulting number.
Bit positions are counted from right to left, starting with 0 (LSB).

Example 1
Input:
N = 100
L = 1
R = 3

Binary:
100 → 1100100
Positions: 6 5 4 3 2 1 0
Clear bits from positions 1 to 3 →
1100100
   ↓↓↓
1100000  (after clearing bits 1,2,3)
Output:
96*/
public class bitManipulation_day8b {
    public static int clearIbit(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitmask=a|b;
        
        return n&bitmask;

    }
  public static void main(String[] args){
   int a= clearIbit(10,2,4);//10 number 2and4 range 
    System.out.println(a);
    System.out.println(clearIbit(100, 1, 3));//96 ans

  }
}
