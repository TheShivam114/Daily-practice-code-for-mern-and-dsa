/*
Problem:
Write a program to perform Inorder Traversal of a Binary Tree.
In Inorder Traversal, nodes are visited in the following order:

Left Subtree → Root → Right Subtree
Example
        1
       / \
      2   3
     / \
    4   5

Inorder Traversal Output:
4 2 5 1 3
Algorithm
Traverse the left subtree.
Visit the root node.
Traverse the right subtree.
*/


   class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day5 {

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);   // visit left subtree
        System.out.print(root.data + " ");  // visit root
        inorder(root.right);  // visit right subtree
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

