/*
  Given a string s consisting of only lowercase English letters, process the string as a stream of characters.
For each character added to the stream, return the first non-repeating character at that moment.
If no such character exists, append '#' to the result.
Return the final string formed by the sequence of first non-repeating characters.
Example 1:
Input:
s = "aabc"
Output:
"a#bb"
Explanation:
After reading 'a' → first non-repeating is 'a'
After reading second 'a' → no non-repeating → '#'
After reading 'b' → first non-repeating is 'b'
After reading 'c' → first non-repeating is 'b'
Example 2:

Input:
s = "zz"
Output:
"z#"
Constraints:
1 ≤ s.length ≤ 10^5
s contains only lowercase English letters.
The solution must run in O(n) time.
Function Signature (Java)
public String firstNonRepeating(String s)
Follow-up
Can you solve the problem using:
A Queue to maintain order?
A frequency array to track occurrences?
O(n) time and O(1) extra space?
*/
import java.util.*;
public class Queue_day8 {
    public static void printnonRepating(String str){
        int freq[] =new int [26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        String str="aabccxb";
        printnonRepating(str);
    }
}
