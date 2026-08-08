/*
Shortest Unique Prefix

Given a list of lowercase words, find the shortest unique prefix for each word.
A unique prefix is the smallest prefix that distinguishes a word from all other words in the list.

Assume:

No word is a prefix of another word.
Input Format
First line contains an integer n — number of words.
Second line contains n space-separated lowercase words.
Output Format

Print the shortest unique prefix of each word in the same order.

Constraints
1 <= n <= 1000
1 <= word length <= 100
All words contain only lowercase English letters.
Example
Input
4
zebra dog duck dove
Output
z
dog
du
dov
Explanation
"z" uniquely identifies "zebra"
"dog" is needed because "do" is common with "dove"
"du" uniquely identifies "duck"
"dov" uniquely identifies "dove"
*/
    public class tries_day5  {
    static class Node {
        Node children[] = new Node[26];
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {

        Node curr = root;

        for (int level = 0; level < word.length(); level++) {

            int idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
    }
    public static void findPrefix(Node root, String ans) {

        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i],
                        ans + (char)(i + 'a'));
            }
        }
    }
    public static void main(String[] args) {

        String arr[] = {
            "zebra",
            "dog",
            "duck",
            "dove"
        };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}

