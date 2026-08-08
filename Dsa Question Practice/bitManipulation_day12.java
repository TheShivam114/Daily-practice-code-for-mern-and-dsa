/*Question: Count Numbers With Same Set Bits

Given two integers L and R, you need to count how many numbers in the range [L, R] (inclusive) have the same number of set bits as the number X.

You are given L, R, and X.

Let c = count of set bits in X.

Count all integers i such that
L ≤ i ≤ R and countSetBits(i) = c.

Input Format
L R X

Output Format
Print a single integer — the count of all valid numbers.
Constraints
1 ≤ L ≤ R ≤ 10⁹
1 ≤ X ≤ 10⁹
Time complexity target: O(log R) or better per number (must use bit manipulation) */
public class bitManipulation_day12 {
    public static int count (int n){
         int count = 0;
        while (n > 0) {
            n &= (n - 1); // removes the rightmost set bit
            count++;
        }
        return count;
    }
    public static void main(String[] args){
          int a=count(5);
          System.out.println(a);
    }
}
