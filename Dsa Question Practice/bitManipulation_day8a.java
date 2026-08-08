/*Clear Last i Bits

Given two integers N and i, clear (set to 0) the last i bits of N and return the result.

Example

Input:

N = 29
i = 3


Output:

24

Explanation
29 in binary → 11101
Clearing last 3 bits → 11000 (which is 24) */
public class bitManipulation_day8a {
    public static int clearIthBit(int n,int i ){
        int bitmask=(~0)<<i;
        return n& bitmask;
    }
   public static void main(String[] args){
    int a=clearIthBit(15,2);
    System.out.println(a);
   } 
}
