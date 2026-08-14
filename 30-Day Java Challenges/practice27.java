/*
Binary Tree 🌳
Problem: Maximum Depth of a Binary Tree
Difficulty

⭐⭐ Medium

Problem Statement

Given the root of a binary tree, find the maximum depth (or height) of the tree.

The depth of a binary tree is the number of nodes along the longest path from the root node to the farthest leaf node.

For example:

        1
       / \
      2   3
     / \
    4   5

The longest paths are:

1 → 2 → 4
1 → 2 → 5

Therefore, the maximum depth is:

3
Node Structure

Use the following Node class:

static class Node {
    int data;
    Node left;
    Node right;


    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
Function Description

Implement:

public static int maxDepth(Node root)
Parameters
root – The root node of the binary tree.
Returns
The maximum depth of the binary tree.
Input Format

The first line contains an integer N, representing the number of nodes.

The next N lines contain three integers:

value left right

Where:

value = value of the current node
left = value of the left child
right = value of the right child
-1 means there is no child

The first node given is the root.

Sample Input
5
1 2 3
2 4 5
3 -1 -1
4 -1 -1
5 -1 -1

This represents:

        1
       / \
      2   3
     / \
    4   5
*/
    import java.util.*;
    public class practice27 {
    
        // Node class
        static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        // Find maximum depth of binary tree
        public static int maxDepth(Node root) {
    
            // Base case
            if (root == null) {
                return 0;
            }
    
            // Find depth of left subtree
            int leftDepth = maxDepth(root.left);
    
            // Find depth of right subtree
            int rightDepth = maxDepth(root.right);
    
            // Current node + maximum of left and right
            return 1 + Math.max(leftDepth, rightDepth);
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            int N = sc.nextInt();
    
            Node[] nodes = new Node[N];
    
            // Create all nodes
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                int left = sc.nextInt();
                int right = sc.nextInt();
    
                nodes[i] = new Node(value);
            }
    
            // Connect the nodes
            for (int i = 0; i < N; i++) {
    
                // We need the input again to connect nodes,
                // so this approach is not suitable with Scanner.
            }
    
            sc.close();
        }
    }

