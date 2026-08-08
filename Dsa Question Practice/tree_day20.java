/*
  Problem Title:
K-th Ancestor of a Node in a Binary Tree
Problem Statement
Given a binary tree, a target node value X, and an integer K, write a program to find the K-th ancestor of the given node.
The K-th ancestor of a node is the node that is K levels above it in the tree.

Input
A binary tree with N nodes
An integer X (target node)
An integer K
Output
Print the K-th ancestor of node X
If such an ancestor does not exist, print -1
Example
Input:

Tree:
        1
       / \
      2   3
     / \
    4   5

X = 5, K = 2

Output:

1
Explanation
Parent of 5 → 2 (1st ancestor)
Parent of 2 → 1 (2nd ancestor)
Hence, K-th ancestor = 1
Task
Construct the binary tree
Locate the node with value X
Traverse upward to find the K-th ancestor
Print the result
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data=data;
        left =right =null;
    }
}
public class tree_day20{

    static int k;

    static Node findKthAncestor(Node root, int target) {
        if (root ==null) return null;
        if (root.data ==target) {
            return root;
        }
        Node left = findKthAncestor(root.left, target);
        Node right =findKthAncestor(root.right, target);
        if (left !=null||right!= null) {
            k--;
            if (k==0) {
                System.out.println("K-th Ancestor = " + root.data);
                return null; // stop further propagation
            }
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        int target = 5;
        k = 2;

        findKthAncestor(root, target);
        if (k > 0) {
            System.out.println("K-th Ancestor = -1");
        }
    }
}
    

