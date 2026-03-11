/*
   Write a program to perform Inorder Traversal of a Binary Tree. In Inorder Traversal, the nodes are visited in the following order:
Left Subtree → Root → Right Subtree
The program should traverse the binary tree and print the nodes in inorder sequence.

Example
Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:
Inorder Traversal: 4 2 5 1 3
Task

Create a binary tree with nodes.

Implement a function to perform inorder traversal.

Print the nodes in inorder order.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day7a {

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);            // Visit left subtree
        System.out.print(root.data + " "); // Visit root
        inorder(root.right);           // Visit right subtree
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}

