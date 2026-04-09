/*
Print Nodes in a Given Range in a Binary Search Tree

You are given the root of a Binary Search Tree (BST) and two integers low and high. Your task is to print all the node values that lie within the given range 

[low,high] (inclusive).

The output should be printed in ascending order.

Input:
Root of a BST
Two integers low and high
Output:

Print all node values such that:
low≤node.val≤high
Values must be printed in sorted (ascending) order
Constraints:

1≤n≤10

≤Node.val≤10
low≤high
Example:

Input:

        8
       / \
      3   10
     / \    \
    1   6    14
       / \   /
      4   7 13

low = 5, high = 13
Output:
6 7 8 10 13
Explanation:
Nodes within range 
[5,13] → 6, 7, 8, 10, 13
Printed in ascending order using inorder traversal
💡 Hint:
Use inorder traversal
Optimize:
If node.val < low → skip left subtree
If node.val > high → skip right subtree
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

public class binary_search_day7 {
    public void printInRange(TreeNode root, int low, int high) {
        if (root == null) return;
        if (root.val > low) {
            printInRange(root.left, low, high);
        }
        if (root.val >= low && root.val <= high) {
            System.out.print(root.val + " ");
        }
        if (root.val < high) {
            printInRange(root.right, low, high);
        }
    }
    public static void main(String[] args) {
        binary_search_day7 obj = new binary_search_day7();

        /*
                8
               / \
              3   10
             / \    \
            1   6    14
               / \   /
              4   7 13
        */

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        int low = 5, high = 13;
        System.out.print("Nodes in range: ");
        obj.printInRange(root, low, high);
    }
}

