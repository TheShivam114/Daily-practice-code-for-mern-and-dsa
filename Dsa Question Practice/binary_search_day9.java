/*
You are given the root of a binary tree. Your task is to determine whether the given tree satisfies the properties of a Binary Search Tree (BST).

A binary tree is considered a valid BST if:

The left subtree of every node contains only values strictly less than the node’s value.
The right subtree of every node contains only values strictly greater than the node’s value.
Both the left and right subtrees must also be valid BSTs.
Input:
Root node of a binary tree
Output:
Return true if the tree is a valid BST
Otherwise, return false
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
In Example 2, node 3 lies in the right subtree of 5 but is smaller than 5, violating BST rules.
💡 Hint:
Do not only compare with parent
Use range (min, max) validation
OR use inorder traversal (should be sorted)
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

public class binary_search_day9 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        binary_search_day9 obj = new binary_search_day9();

        /*
                5
               / \
              1   4
                 / \
                3   6
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        boolean result = obj.isValidBST(root);
        System.out.println("Is Valid BST: " + result);
    }
}

