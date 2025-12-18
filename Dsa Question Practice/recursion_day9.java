/*You are given a string S consisting of lowercase English letters.
Your task is to remove all duplicate characters from the string such that:
Each character appears only once
The order of first occurrence of characters is preserved
Input
A single string S (1 ≤ |S| ≤ 10⁵)
Output
Print the string after removing duplicate characters.
Constraints
The string contains only characters from 'a' to 'z'
No extra sorting is allowed
Maintain original order
Example 1

Input
programming
Output
progamin

Example 2

Input
aabbccddeeff
Output
abcdef */
public class recursion_day9 {
    public static void removeStr(String str , StringBuffer newStr,boolean[] arr,int idx) {
        if(idx==str.length()){
            System.out.println(newStr);
            return ;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(arr[currChar-'a']==true){
            removeStr(str, newStr, arr, idx+1);
            return;
        }
        else{
            arr[currChar-'a']=true;
            removeStr(str, newStr.append(currChar), arr, idx+1);
        }

    }

    public static void main(String[] args) {
        String n = "aabbccddeeff";
        removeStr(n, new StringBuffer(""), new boolean[25], 0);

    }
}
