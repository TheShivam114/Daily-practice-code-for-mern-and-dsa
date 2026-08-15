/*
Binary Search Tree (BST)
Problem: Search for a Value in a BST
Difficulty

⭐⭐ Medium

Problem Statement

Given the root of a Binary Search Tree (BST) and an integer X, determine whether X exists in the tree.

A Binary Search Tree follows this rule:

All values in the left subtree are smaller than the current node.
All values in the right subtree are greater than the current node.

If X exists, return true; otherwise, return false.

Example

BST:

        8
       / \
      4   12
     / \  / \
    2  6 10 14

Search:

X = 10

Output:

true

Search:

X = 7

Output:

false
Node Structure
static class Node {
    int data;
    Node left;
    Node right;


    Node(int data) {
        this.data = data;
    }
}
Function Description

Implement:

public static boolean search(Node root, int X)
Parameters
root – Root of the BST.
X – Value to search for.
Returns
true if X exists.
false otherwise.
Input Format

The first line contains:

N X

where N is the number of values and X is the value to search.

The second line contains N space-separated integers.

The values should be inserted into the BST in the given order.

Sample Input
7 10
8 4 12 2 6 10 14
Sample Output
true
Explanation

The BST becomes:

        8
       / \
      4   12
     / \  / \
    2  6 10 14

Search for 10:

10 > 8

Go right.

10 < 12

Go left.

10 == 10

Value found.

Therefore:

true
*/
import java.util.*;

public class practice28 {

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

    // Insert a value into the BST
    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Search for a value in the BST
    public static boolean search(Node root, int X) {

        // Value not found
        if (root == null) {
            return false;
        }

        // Value found
        if (root.data == X) {
            return true;
        }

        // Search left subtree
        if (X < root.data) {
            return search(root.left, X);
        }

        // Search right subtree
        return search(root.right, X);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        Node root = null;

        // Build the BST
        for (int i = 0; i < N; i++) {

            int value = sc.nextInt();

            root = insert(root, value);
        }

        // Search for X
        boolean result = search(root, X);

        System.out.println(result);

        sc.close();
    }
}
