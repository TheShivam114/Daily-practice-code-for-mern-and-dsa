/*Which of the following recursive functions correctly reverses a given string s?
Function Signature (Pseudo Code):
reverse(s, index)
Assume:
s is a string
index is the starting position (initially 0)
length(s) gives the length of the string
Options
A
function reverse(s, index):
    if index == length(s):
        return ""
    return reverse(s, index + 1) + s[index] */
public class recursion_day7 {
       //code
        static String reverse(String s, int index) {
            if (index == s.length()) {
                return "";
            }
            return reverse(s, index + 1) + s.charAt(index);
        }

        public static void main(String[] args) {
            String str = "DATA";

            String result = reverse(str, 0);
            System.out.println("Reversed String: " + result);
        }
    

}
