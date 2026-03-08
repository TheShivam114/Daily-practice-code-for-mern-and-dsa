/*
  Problem:
Write a program to count the number of leaf nodes in a Binary Tree.
A leaf node is a node that does not have any children (both left and right pointers are NULL).
Example
        1
       / \
      2   3
     / \
    4   5

Leaf Nodes: 4, 5, 3
Output:

Number of leaf nodes = 3
Algorithm
If the root node is NULL, return 0.
If both left and right of the node are NULL, it is a leaf node, return 1.
Recursively count leaf nodes in the left subtree.
Recursively count leaf nodes in the right subtree.
Return leftCount + rightCount.
*/
    class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class tree_day4  {
    static int countLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Number of leaf nodes = " + countLeafNodes(root));
    }
}

