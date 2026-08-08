/*Given a string S = "abc", write a program using the Divide and Conquer approach to find and print all possible subsets 
(also called the power set) of the given string.
At each step, you must divide the problem by considering two choices for every character:
Include the current character in the subset
Exclude the current character from the subset
Continue this process until all characters are processed.

Input
A string S consisting of lowercase English letters.
For this problem:
S = "abc"
Output
Print all possible subsets of the given string.
Each subset should be printed on a new line.

Expected Output
abc
ab
ac
a
bc
b
c
(empty)
(Note: The empty subset should also be printed.)

Constraints
1 ≤ length of S ≤ 10
Use recursion with divide and conquer
Do not use any inbuilt subset or power-set functions
Explanation
For each character in the string, the algorithm divides the problem into two recursive calls:
One including the character
One excluding the character
This results in 2ⁿ subsets for a string of length n.
Time Complexity

O(2ⁿ)
Space Complexity
O(n) (recursive stack) */
public class backTracking_day3 {
    public static void findString(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findString(str, ans + str.charAt(i), i + 1);
        // no choice
        findString(str, ans, i + 1);
    }

    public static void main(String[] args) {
        // String str=new String("abc");
        String str = "abc";
        findString(str, "", 0);
    }
}
