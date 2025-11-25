/*Find the i-th Bit of a Number

Given two integers N and i, write a program to find the value of the i-th bit of N (counting from 0th bit from the right).

If the i-th bit is 1, print 1

If the i-th bit is 0, print 0

 Example
Input:
N = 13
i = 2

Binary of 13 = 1101
i-th bit from right = 1

Output:
1 */
public class bitManipulation_day7a {
    public static int get_IthBit(int n,int i){
        int bitMask=1<<i;
         if((n&bitMask)==0){
            return 0;
         }
         else
         {
            return 1;
         }
    }
    public static void main(String[] args){
        // get_IthBit(10,2);
        
        System.out.println(get_IthBit(10, 1));
        System.out.println(get_IthBit(10, 2));
    }
}
