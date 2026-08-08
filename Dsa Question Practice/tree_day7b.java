/*
Write a program to perform Postorder Traversal of a Binary Tree. In Postorder Traversal, the nodes are visited in the following order:

Left Subtree → Right Subtree → Root

The program should traverse the binary tree and print the nodes in postorder sequence.

Example

Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Postorder Traversal: 4 5 2 3 1
Task

Create a binary tree.

Implement a function to perform postorder traversal.

Print the nodes in postorder order.
*/
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day7b {
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);     // Visit left subtree
        postorder(root.right);    // Visit right subtree
        System.out.print(root.data + " "); // Visit root
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Postorder Traversal: ");
        postorder(root);
    }
}


