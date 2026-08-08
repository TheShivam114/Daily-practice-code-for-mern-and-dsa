/*
 Search a String in Trie

You are given a list of lowercase strings and a search word.
Your task is to build a Trie (Prefix Tree) by inserting all strings and then check whether the given search word exists in the Trie or not.

Return:

"Found" if the word exists
"Not Found" otherwise
Input Format
First line contains an integer n — number of strings.
Next n lines contain lowercase strings.
Last line contains the word to search.
Output Format

Print:

Found if the word exists in the Trie
Not Found otherwise
Constraints
1 <= n <= 1000
1 <= length of string <= 100
Strings contain only lowercase English letters.
Example 1


Input
5
apple
app
bat
ball
cat
bat
Output
Found
Example 2
Input
5
apple
app
bat
ball
cat
dog
Output
Not Found
*/
    class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }
    void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }
    boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }
        return current.isEndOfWord;
    }
}

public class tries_day3 {
    public static void main(String[] args) {

        String[] words = {
            "apple",
            "app",
            "bat",
            "ball",
            "cat"
        };

        String searchWord = "bat";

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        if (trie.search(searchWord)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

