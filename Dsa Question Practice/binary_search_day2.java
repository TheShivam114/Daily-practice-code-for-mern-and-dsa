/*
Kth Smallest Element in a BST

You are given the root of a Binary Search Tree and an integer k. Your task is to return the kth smallest element in the BST.

Input:
Root of a BST
An integer k such that 

1≤k≤n
Output:
Return the value of the kth smallest node
Constraints:

1≤n≤10
0≤Node.val≤10
9
The tree is a valid BST
Example 1:

Input:

      3
     / \
    1   4
     \
      2

k = 1

Output:

1
Example 2:

Input:

      5
     / \
    3   6
   / \
  2   4
 /
1

k = 3

Output:

3


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

public class binary_search_day2 {

    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        binary_search_day2 obj = new binary_search_day2();

        /*
              5
             / \
            3   6
           / \
          2   4
         /
        1
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int k = 3;

        int ans = obj.kthSmallest(root, k);
        System.out.println("Kth Smallest Element: " + ans);
    }
}

