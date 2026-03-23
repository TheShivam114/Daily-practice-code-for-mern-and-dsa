/*
   Find Distance Between Two Nodes in a Binary Tree
Problem Statement
Given a binary tree and two nodes n1 and n2, write a program to find the distance between these two nodes.
The distance between two nodes is defined as the number of edges in the shortest path connecting them.
Input
A binary tree with N nodes
Two integers n1 and n2
Output
Print the distance between node n1 and node n2
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
Distance = 2
Explanation
Path from 4 → 2 → 5
Number of edges = 2
Hence, distance = 2
Hint (Relation to LCA)
First find the Lowest Common Ancestor (LCA) of n1 and n2
Then:
Find distance from LCA to n1
Find distance from LCA to n2
Total distance = d1 + d2
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class tree_day19 {
    // Step 1: Find LCA
    static Node findLCA(Node root, int n1, int n2) {
        if (root ==null) return null;
        if (root.data ==n1 || root.data == n2) {
            return root;
        }
        Node left =findLCA(root.left, n1, n2);
        Node right =findLCA(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }
        return (left !=null) ? left : right;
    }
    // Step 2: Find distance from root to a given node
    static int findDistance(Node root, int target, int dist) {
        if (root ==null) return -1;

        if (root.data ==target) return dist;

        int left =findDistance(root.left, target, dist + 1);
        if (left != -1) return left;

        return findDistance(root.right, target, dist + 1);
    }
    // Step 3: Combine both
    static int distance(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);
        int d1 = findDistance(lca, n1, 0);
        int d2 = findDistance(lca, n2, 0);
        return d1 + d2;
    }
    public static void main(String[] args) {

        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int n1 = 4, n2 = 5;

        System.out.println("Distance = " + distance(root, n1, n2));
    }
}

