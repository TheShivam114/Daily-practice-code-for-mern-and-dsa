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
public class recursion_day11a {
    public static int frndpair(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return n;
        }
        //choice 
        //single
        int fnm1=frndpair(n-1);
        //pair
        int fnm2=frndpair(n-2);
        int pairways=(n-1)*fnm2;
        //totways
        int totways=fnm1+pairways;
        return totways;

// return frndpair(n-1)+(n-1)*frndpair(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(frndpair(n));
    }
}
