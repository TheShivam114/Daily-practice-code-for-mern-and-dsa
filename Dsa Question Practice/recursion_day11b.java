/*You are given a string S consisting of lowercase English letters.
Write a recursive function to determine whether the given string is a palindrome.
A string is called a palindrome if it reads the same forward and backward.
Constraints
Do not use loops (for, while)
Do not use any built-in string reverse functions
Use recursion only
Compare characters using two pointers (start and end)

Input
S = "madam"
Output
true
Function Signature
boolean isPalindrome(String s, int start, int end)
Explanation
The function compares the characters at positions start and end.
If both characters are equal, recursively check the substring
s[start + 1 ... end - 1]

If any mismatch occurs, return false
The recursion stops when start >= end, indicating all characters matched */
public class recursion_day11b {
    public static boolean isPalindrome(String s, int start, int end) {
        // Base case
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        

        boolean result = isPalindrome(s, 0, s.length() - 1);
        System.out.println(result);
    } 
}
