/*
  Write a program to find the height of a Binary Tree. The height of a binary tree is the number of levels (or nodes) along the longest path from the root node to a leaf node.

Example

Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Height of tree = 3
Task

Create a binary tree.

Traverse the tree using recursion.

Calculate and return the height of the tree.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day10b{

    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height of tree = " + height(root));
    }
}

