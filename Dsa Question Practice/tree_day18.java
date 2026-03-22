/*
   Find the Lowest Common Ancestor (LCA) in a Binary Tree

Problem Statement
Given a binary tree and two nodes n1 and n2, write a program to determine their Lowest Common Ancestor (LCA).
The Lowest Common Ancestor of two nodes is defined as the lowest (deepest) node in the tree that has both nodes 
as descendants. A node can be a descendant of itself.
Input
A binary tree with N nodes.
Two integers n1 and n2 representing the values of the nodes.
Output
Print the value of the Lowest Common Ancestor of n1 and n2.
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
Node 4 lies in the left subtree of node 2.
Node 5 lies in the right subtree of node 2.
Therefore, node 2 is the lowest node that has both 4 and 5 as descendants.
Constraints
1 ≤ N ≤ 10^5
All node values are unique
Both nodes n1 and n2 are guaranteed to exist in the tree
Task
Construct the binary tree.
Implement an efficient method to find the LCA.
Print the result.
*/
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day18 {
    static Node findLCA(Node root, int n1, int n2) {
        if (root==null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);

        // If both sides return non-null, root is LCA
        if (left !=null && right!= null) {
            return root;
        }
        return (left != null) ?left:right;
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);

        int n1 = 4, n2 = 5;
        Node lca = findLCA(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA = " +lca.data);
        } else {
            System.out.println("Nodes not found");
        }
    }
}
    
