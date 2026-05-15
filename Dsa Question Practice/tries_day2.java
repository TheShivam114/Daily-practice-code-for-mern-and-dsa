/*Insert Strings into a Trie

You are given a list of lowercase strings. Your task is to build a Trie (Prefix Tree) by inserting all the given strings one by one.

A Trie is a tree-like data structure used to store strings efficiently. Each node represents a character, and words are formed by traversing from the root node to the end node.

Your program only needs to perform the insert operation.

Input Format
First line contains an integer n — the number of strings.
Next n lines contain one lowercase string each.
Output Format

Print:

Inserted Successfully

after inserting all strings into the Trie.

Constraints
1 <= n <= 1000
1 <= length of string <= 100
Strings contain only lowercase English letters.
Example
Input
5
apple
app
bat
ball
cat
Output
Inserted Successfully
*/
public class tries_day2 {
    static class Node{
        Node children[] =new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
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
    public static void main(String[] args){
        String Word[]={"tre","a","there","their","any","thee"};
        for(int i=0;i<Word.length;i++ ){
              insert(Word[i]);
        }
        
    }
}
