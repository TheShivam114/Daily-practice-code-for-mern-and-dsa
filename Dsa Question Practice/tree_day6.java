/*
Write a program to perform Preorder Traversal of a Binary Tree. In Preorder Traversal, the nodes are visited in the following order:

Root → Left Subtree → Right Subtree

The program should traverse the binary tree and print the nodes in preorder sequence.

Example

Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Preorder Traversal: 1 2 4 5 3
Task

Create a binary tree.

Implement a function to perform preorder traversal.

Print the nodes in preorder sequence.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day6 {

    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " "); // visit root
        preorder(root.left);               // visit left subtree
        preorder(root.right);              // visit right subtree
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}

