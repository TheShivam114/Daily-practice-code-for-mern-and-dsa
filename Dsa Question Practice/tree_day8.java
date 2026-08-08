/*
   Write a program to perform Level Order Traversal of a Binary Tree. In Level Order Traversal, 
   nodes are visited level by level from left to right, starting from the root node.
This traversal is also known as Breadth-First Traversal (BFS) and is typically implemented using a queue.

Example
Consider the following Binary Tree:

        1
       / \
      2   3
     / \
    4   5

Output:
Level Order Traversal: 1 2 3 4 5
Task
Create a binary tree.
Use a queue to traverse the tree level by level.
Print the nodes in level order sequence.
*/
    import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day8 {
    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.remove();
            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }

            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
    }
}

