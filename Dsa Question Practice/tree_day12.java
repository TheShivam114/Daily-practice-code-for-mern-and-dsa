/*
Problem:
Write a program to find the maximum element in a Binary Tree. The program should traverse the entire binary tree and return the largest value stored in any node of the tree.

Example

Consider the following Binary Tree:

        10
       /  \
      5    20
     / \     \
    2   8     30

Output:

Maximum element = 30
Task

Create a binary tree.

Traverse the tree using recursion.

Compare all node values to find the maximum element in the tree.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day12  {

    static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.right = new Node(30);

        System.out.println("Maximum element = " + findMax(root));
    }
}

