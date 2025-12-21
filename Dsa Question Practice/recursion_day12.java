/*Print All Binary Strings of Length N Without Consecutive 1s
Statement:
Given a positive integer N, print all possible binary strings of length N such that no two consecutive characters are '1'.
A binary string consists only of characters '0' and '1'.

Input:
A single integer N (1 ≤ N ≤ 20)

Output:
Print all valid binary strings of length N that do not contain consecutive 1s.
Each string should be printed on a new line.

Example 1:
Input:
3
Output:
000
001
010
100
101 */
public class recursion_day12 {
    public static void printBinaryString(int n, int lastplace,String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastplace ==0){
        //     //sit 0 on chair n
        //     printBinaryString(n-1,0 , str.append("0"));
        //     printBinaryString(n-1, 0, str.append("0"));
        // }
        // else{
        //     printBinaryString(n-1, 0, str.append("0"));
        // }

        //0

        printBinaryString(n-1,0, str+"0");
        if(lastplace==0){
            printBinaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
            printBinaryString(3, 0, "");
    }
}
