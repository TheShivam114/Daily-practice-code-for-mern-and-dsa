/*
  Print Nodes at K-th Level of a Binary Tree
Problem Statement
Given a binary tree and an integer K, write a program to print all nodes present at the K-th level of the tree.
The root node is considered at level 1. The nodes at each level should be printed from left to right.
Input
A binary tree with N nodes
An integer K representing the level to be printed
Output
Print all node values present at the K-th level
If K is greater than the height of the tree, print "Invalid Level"
Example

Input:

Tree:
        1
       / \
      2   3
     / \
    4   5

K = 3

Output:

4 5
Explanation
Level 1 → 1
Level 2 → 2, 3
Level 3 → 4, 5
Therefore, nodes at level 3 are 4 and 5
Task
Construct the binary tree
Traverse the tree
Print nodes that lie on the K-th level
Constraints
1 ≤ N ≤ 10^5
1 ≤ K ≤ N
Follow-up
Can you solve this using:
Recursion (DFS)
Level Order Traversal (BFS)
What is the time complexity of your solution?
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day22 {
    static void printKthLevel(Node root, int k, int level) {
        if (root==null) return;
        if (level ==k) {
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.left, k, level + 1);
        printKthLevel(root.right, k, level + 1);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int k = 3;
        System.out.print("Nodes at level " + k + ": ");
        printKthLevel(root, k, 1);
    }
}

