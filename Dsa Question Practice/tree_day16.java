/*
  Problem Title:
Top View of a Binary Tree
Problem Statement
Given a binary tree, write a program to print the Top View of the tree.
The Top View of a binary tree is the set of nodes visible when the tree is viewed from the top. For every horizontal distance (HD) from the root, 
only the first node encountered at that distance should be included in the output.
Input

A binary tree with N nodes.
Output
Print the top view of the binary tree from leftmost to rightmost node.
Example
Input:

        1
       / \
      2   3
       \
        4
         \
          5
           \
            6

Output:

2 1 3 6
Explanation
Node 2 is the leftmost node visible from the top.
Node 1 is the root.
Node 3 is visible on the right.
Node 6 is the farthest right node visible from the top.
Nodes 4 and 5 are hidden when viewed from the top.
Task
Assign a horizontal distance (HD) to each node:
Root → HD = 0
Left child → HD - 1
Right child → HD + 1
Traverse the tree using level order traversal (BFS).
Store the first node encountered at each HD.
Print nodes in order of increasing HD.
Constraints
1 ≤ N ≤ 10^5
Node values are integers.
Follow-up
Can you implement this using a HashMap and Queue?
What is the time and space complexity of your solution?
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
class Pair {
    Node node;
    int hd;
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class tree_day16 {
    static void topView(Node root) {
        if (root == null) return;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }
            if (curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
            }
        }
        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);  
        System.out.print("Top View: ");
        topView(root);
    }
}

