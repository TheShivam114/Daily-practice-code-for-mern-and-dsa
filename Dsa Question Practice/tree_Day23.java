/*
Find the Lowest Common Ancestor (LCA) in a Binary Tree

Problem Statement

Given a binary tree and two nodes n1 and n2, write a program to find their Lowest Common Ancestor (LCA).

The Lowest Common Ancestor is defined as the deepest node in the tree that has both n1 and n2 as descendants. A node can be a descendant of itself.

Input
A binary tree with N nodes
Two integers n1 and n2 representing the nodes
Output
Print the value of the Lowest Common Ancestor
Example

Input:

Tree:
        1
       / \
      2   3
     / \
    4   5

n1 = 4, n2 = 5

Output:

LCA = 2
Explanation
Node 4 lies in the left subtree of node 2
Node 5 lies in the right subtree of node 2
Therefore, 2 is the lowest node having both as descendants
Task
Construct the binary tree
Implement a function to find LCA
Print the result
Constraints
1 ≤ N ≤ 10^5
All node values are unique
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_Day23 {

    static Node findLCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        // If current node matches n1 or n2
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Search in left and right subtree
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);

        // If both sides return non-null → LCA found
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null value
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int n1 = 4, n2 = 5;

        Node lca = findLCA(root, n1, n2);

        if (lca != null) {
            System.out.println("LCA = " + lca.data);
        } else {
            System.out.println("Nodes not found");
        }
    }
}

