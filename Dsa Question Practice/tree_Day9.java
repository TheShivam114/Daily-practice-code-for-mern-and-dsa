/*
   Write a program to count the total number of nodes in a Binary Tree. The program should traverse the entire 
   binary tree and return the total number of nodes present in the tree.

Example

Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:

Total number of nodes = 5
Task
Create a binary tree structure.

Traverse the tree using recursion.

Count and return the total number of nodes in the binary tree.

*/

    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class tree_Day9 {

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

        System.out.println("Total number of nodes = " + countNodes(root));
    }
}

