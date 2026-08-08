/*
  You are given the root of a Binary Search Tree (BST) and an integer value target. Your task is to determine whether the given value exists in the BST.

Input:
Root of a BST
An integer target
Output:
Return true if the value exists in the BST
Otherwise, return false
Constraints:

1≤n≤10

≤Node.val≤10
9
Example:

Input:

      5
     / \
    3   7
   / \   \
  2   4   8

target = 4

Output:

true
💡 Hint:
If target < root.val → go to left subtree
If target > root.val → go to right subtree
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

public class binary_search_day3 {
    public boolean searchBST(TreeNode root, int target) {
        if (root == null) return false;

        if (root.val == target) return true;

        if (target < root.val) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }
    public static void main(String[] args) {
        binary_search_day3 obj = new binary_search_day3();

        /*
              5
             / \
            3   7
           / \   \
          2   4   8
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        int target = 4;

        boolean found = obj.searchBST(root, target);
        System.out.println("Element found: " + found);
    }
}
