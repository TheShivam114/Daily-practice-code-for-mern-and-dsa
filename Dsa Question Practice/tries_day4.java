/*
  Word Break Problem

Given a string s and a dictionary of words wordDict, determine whether the string can be segmented
into a space-separated sequence of one or more dictionary words.
Return:

true if the string can be segmented
false otherwise

You may reuse dictionary words multiple times.

Input Format
First line contains an integer n — number of words in the dictionary.
Second line contains n space-separated dictionary words.
Third line contains the input string s.
Output Format

Print:

true if the string can be segmented using dictionary words
false otherwise
Constraints
1 <= n <= 1000
1 <= word length <= 20
1 <= s.length <= 300
All strings contain only lowercase English letters.
Example 1
Input
6
i like sam samsung mobile ice
ilikesamsung
Output
true
Explanation

The string can be segmented as:

i + like + samsung
Example 2
Input
5
apple pen mango cat dog
applepenapple
Output
true
Example 3
Input
4
cats dog sand and
catsandog
Output
false
*/
public class tries_day4 {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root =new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true; 
        }

         public static boolean search(String key){
            Node curr=root;
            for(int level=0;level<key.length();level++){
                int idx=key.charAt(level)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr=curr.children[idx];

            }
            return curr.eow==true;
        }
     public static boolean WordBreak(String key){
        if(key.length()==0){
             return true;
        }
        for(int i=1;i<=key.length();i++){
            if(search(key.substring( 0,i))&&
           WordBreak( key.substring(i)))
           {
            return true;
           }
        }
        return false;

     }
        public static void main(String[] args){
             String arr[] = {"i","like","sam", "samsung","mobile","ice" };
              for(int i=0;i<arr.length;i++){
                insert(arr[i]);
              }
              String key="ilikesamsung";
              System.out.println(WordBreak(key));
              
        }
    }

