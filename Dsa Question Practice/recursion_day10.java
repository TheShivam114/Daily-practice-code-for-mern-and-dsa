/*Friends Pairing Problem
You are given n friends, numbered from 1 to n.
Each friend can either:
Remain single, or
Be paired with exactly one other friend
Each friend can be part of at most one pair.
Task
Determine the total number of distinct ways in which the n friends can either stay single or be paired up.
Input
A single integer n (1 ≤ n ≤ 30)
Output
Print a single integer representing the total number of possible arrangements.

Constraints
A friend can be paired with only one other friend
Pairing (i, j) is the same as (j, i)
Order of pairs does not matter
Example 1
Input
3
Output
4
Explanation
Possible arrangements:
(1)(2)(3)
(1)(23)
(12)(3) */
public class recursion_day10 {
    public static int countWays(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return n;
        }
        int single = countWays(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countWays(n));
    }
}
