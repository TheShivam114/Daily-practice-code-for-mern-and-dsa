/*
Find Minimum and Maximum in a Binary Search Tree

You are given the root of a Binary Search Tree (BST). Your task is to find:

The minimum value in the BST
The maximum value in the BST
Input:
Root of a BST
Output:
Return the minimum and maximum values present in the tree
Constraints:
1
≤
𝑛
≤
10
5
1≤n≤10
5
Example:

Input:

        5
       / \
      3   7
     / \   \
    2   4   9
Output:
Minimum = 2
Maximum = 9
💡 Hint:
Minimum → go leftmost
Maximum → go rightmost
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

public class binary_search_day6{
    public int findMin(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.left != null) {
            root = root.left;
        }

        return root.val;
    }
    public int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }
    public static void main(String[] args) {
        binary_search_day6 obj = new binary_search_day6();

        /*
                5
               / \
              3   7
             / \   \
            2   4   9
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(9);

        int min = obj.findMin(root);
        int max = obj.findMax(root);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

