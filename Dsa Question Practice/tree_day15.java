/*
    Write a program to check whether a Binary Tree is height-balanced.
A binary tree is said to be height-balanced if for every node, the difference between the heights of the left and right subtrees is not more than 1.

Example
Balanced Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Tree is Balanced
Unbalanced Tree:

        1
       /
      2
     /
    3

Output:

Tree is Not Balanced
Task
Create a binary tree.
Calculate the height of left and right subtrees.
Check the balance condition for every node.
Return or print whether the tree is balanced or not.
Approach (Optimized - O(n))
Traverse the tree once.
At each node:
Get left height
Get right height
Check difference ≤ 1
Return -1 if unbalanced (early stop)
*/

    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day15 {

    static int checkHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        if (checkHeight(root) == -1) {
            System.out.println("Tree is Not Balanced");
        } else {
            System.out.println("Tree is Balanced");
        }
    }
}

