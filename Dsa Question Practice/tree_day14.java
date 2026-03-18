/*
   Problem:
Write a program to check whether one binary tree is a subtree of another binary tree.
A tree T2 is said to be a subtree of T1 if there exists a node in T1 such that the subtree rooted at that node is identical to T2.

Example
Tree T1:

        1
       / \
      2   3
     / \
    4   5

Tree T2:

      2
     / \
    4   5

Output:

T2 is a subtree of T1
Task
Create two binary trees T1 and T2.
Check if T2 is a subtree of T1.
Return or print true/false.

Approach
If both trees are NULL, return true.
If one is NULL and the other is not, return false.
Check if the trees are identical:
Same root value
Left subtrees identical
Right subtrees identical
If not identical, recursively check:
Left subtree of T1
Right subtree of T1
*/

    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day14 {

    static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return (root1.data == root2.data)
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    static boolean isSubtree(Node T1, Node T2) {
        if (T2 == null) {
            return true;
        }

        if (T1 == null) {
            return false;
        }

        if (isIdentical(T1, T2)) {
            return true;
        }

        return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
    }

    public static void main(String[] args) {

        // Tree T1
        Node T1 = new Node(1);
        T1.left = new Node(2);
        T1.right = new Node(3);
        T1.left.left = new Node(4);
        T1.left.right = new Node(5);

        // Tree T2
        Node T2 = new Node(2);
        T2.left = new Node(4);
        T2.right = new Node(5);

        if (isSubtree(T1, T2)) {
            System.out.println("T2 is a subtree of T1");
        } else {
            System.out.println("T2 is not a subtree of T1");
        }
    }
}

