/*
   Problem:
Write a program to count the total number of nodes in a Binary Tree.
The program should traverse the entire tree and return the total number of nodes present.

Example:

        1
       / \
      2   3
     / \
    4   5

Output:

Number of nodes = 5
Algorithm

If the root node is NULL, return 0.

Recursively count nodes in the left subtree.

Recursively count nodes in the right subtree.

Total nodes = 1 + leftCount + rightCount.
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day1 {

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Number of nodes = " + countNodes(root));
    }
}
