/*
  Write a program to find the sum of all nodes in a Binary Tree. The program should traverse the binary tree
 and return the sum of all node values.

Example
Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:
Sum of all nodes = 15

Explanation:
1 + 2 + 3 + 4 + 5 = 15
Task

Create a binary tree.
Traverse the tree using recursion.

Calculate and return the sum of all nodes.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day10a {

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Sum of all nodes = " + sum(root));
    }
}

