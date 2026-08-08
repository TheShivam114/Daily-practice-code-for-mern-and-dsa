/*
 Write a Java program to check whether a given string is a palindrome or not.

A palindrome is a word, phrase, or sequence that reads the same forward and backward.

You must use the charAt() method to compare characters.
 */
public class stringday1 {
    
        public static void main(String[] args) {
            String str = "madam";

            if (isPalindrome(str)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }

        public static boolean isPalindrome(String str) {
            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false; 
                }
                start++;
                end--;
            }
            return true; // all characters matched
        }
    

}
