/*
You are given the root of a binary tree. Your task is to determine whether the given tree satisfies the properties of a Binary Search Tree (BST).

A binary tree is considered a BST if:

The left subtree of a node contains only nodes with values less than the node’s value.
The right subtree of a node contains only nodes with values greater than the node’s value.
Both the left and right subtrees must also be binary search trees.
Input:
The root node of a binary tree.
Output:
Return true if the tree is a valid BST, otherwise return false.
Constraints:

1≤n≤10
≤Node.val≤10
9
Example 1:

Input:

    2
   / \
  1   3

Output:

true
Example 2:

Input:

    5
   / \
  1   4
     / \
    3   6

Output:

false

Explanation:
Node 3 is in the right subtree of 5 but is less than 5, violating BST rules.
*/
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchDay1 {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        BinarySearchDay1 obj = new BinarySearchDay1();

        // Creating a sample BST
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean result = obj.isValidBST(root);
        System.out.println("Is valid BST: " + result);
    }
}