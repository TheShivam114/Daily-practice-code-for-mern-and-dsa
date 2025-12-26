/*Generate All Permutations Using Backtracking
Objective
Write a program to generate and print all possible permutations of a given string using the backtracking technique.
Problem Description
You are given a string S consisting of distinct characters. Your task is to generate all permutations of the string such that:
Each permutation contains all characters exactly once
The order of permutations does not matter
The solution must use recursion with backtracking
No built-in permutation libraries or functions are allowed

Input
A string S of length N
Output
Print all possible permutations of the string, one per line
Constraints
1 ≤ N ≤ 10
All characters in the string are unique
Use backtracking to undo changes after each recursive call
Example

Input:
S = "ABC"
Output:
ABC
ACB
BAC
BCA
CAB
CBA */
public class backTracking_day3a {
    public static void findPermulation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //kaam
        for(int i=0;i<str.length();i++){
             char curr=str.charAt(i);
             //abcde=ab+de=abde
             String newStr= str.substring(0, i)+str.substring(i+1);
             findPermulation(newStr, ans+curr);
        }
       
        
        
    }
    public static void main(String[] args){
         String str="abc";
         findPermulation(str,"");
    }
}
