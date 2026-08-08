/*Write a recursive program to compute the value of a number raised to a given power efficiently.
Description:
Given two integers a (base) and n (exponent), design a purely recursive algorithm to calculate
𝑎^𝑛
using the Divide and Conquer technique so that the time complexity is O(log n).
Constraints:
a is an integer (positive or negative)
n is a non-negative integer
Do not use loops (for, while)
Do not use built-in power functions

Requirements:
The solution must be implemented using recursion only.
The algorithm must reduce the problem size by half at each recursive step.
Handle both even and odd values of n.
Clearly define the base case.
Input:
Two integers a and n.
Output:
An integer representing the value of aⁿ.
Example:
Input:
a = 2
n = 10
Output:
1024
Expected Time Complexity:
O(logn)

Expected Space Complexity:
𝑂(log 𝑛)
(due to recursive call stack)
 */
public class recursion_day6a {
    public static int optimizedpower(int a,int n){
        if(n==0){
            return 1;
        }
        //if even power
        // int halfpowercal=optimizedpower(a,n/2)*optimizedpower(a, n/2);
        int halfpower=optimizedpower(a, n/2);
        int halfpowercal=halfpower*halfpower;
        //n= if odd power

        if(n%2!=0){
            halfpowercal=a*halfpowercal;
        }
        return halfpowercal;

    }
    public static void main(String[] args){
        System.out.println(optimizedpower(2, 10));
    }
}
