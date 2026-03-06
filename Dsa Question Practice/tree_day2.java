/*
   Write a program to find the height of a Binary Tree. The height of a binary tree is defined as 
   the number of edges (or levels) on the longest path from the root node to a leaf node.
Example:

        1
       / \
      2   3
     / \
    4   5

Output:
Height of tree = 3
Algorithm
If the root node is NULL, return 0.
Recursively calculate the height of the left subtree.
Recursively calculate the height of the right subtree.
The height of the tree =
1 + max(height of left subtree, height of right subtree).
*/


    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day2 {
    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Number of nodes = " + countNodes(root));
    }
}

