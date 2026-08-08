/*
   Write a program to find the diameter of a Binary Tree. The diameter of a binary tree is defined as the number of nodes on the longest path between any two nodes in the tree. This path may or may not pass through the root node.

Example

Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Diameter of tree = 4

Explanation:
The longest path is 4 → 2 → 1 → 3, which contains 4 nodes.

Task

Create a binary tree.

Calculate the height of left and right subtrees.

Compute the diameter using recursion.

Print the diameter of the binary tree.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day11 {
    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of tree = " + diameter(root));
    }
}

