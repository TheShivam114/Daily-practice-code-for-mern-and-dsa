/*Given two integers N and i, write a program to set the i-th bit of N (counting from 0th bit from the right).

Setting a bit means:

Change the i-th bit to 1, regardless of whether it is currently 0 or 1.

Return the new value of N after setting the bit.

 Example
Input:
N = 10
i = 1

Binary of 10 = 1010
Set 1st bit  →  1010 | 0010 = 1010 (no change)

Output:
10 */
public class bitManipulation_day7b {
    public static int set_ithBit(int n,int i){
        int bitMask=1<<i;
        
        // if ((n | bitMask) == 0) {
        //     return 0;
            
        // } else {
        //     return 1;
        // }
        return n | bitMask;
    }
    public static void main(String[] args){
            System.out.println(set_ithBit(10, 2));
    }
}
