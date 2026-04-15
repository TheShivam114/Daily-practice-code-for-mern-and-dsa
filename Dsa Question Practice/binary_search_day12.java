/*
   Find the Lowest Common Ancestor (LCA) in a Binary Search Tree

You are given the root of a Binary Search Tree (BST) and two nodes p and q. Your task is to find their Lowest Common Ancestor (LCA).

The Lowest Common Ancestor is defined as the lowest node in the tree that has both p and q as descendants (a node can be a descendant of itself).
Input:
Root of a BST
Two node values p and q (guaranteed to exist in the BST)
Output:
Return the value of the LCA node
Constraints:
1≤n≤10
5
Example:

Input:

        6
       / \
      2   8
     / \ / \
    0  4 7  9
      / \
     3   5

p = 2, q = 8
Output:
6
Explanation:
Node 6 is the first node where p and q split into different subtrees
💡 Hint:
If both p and q are smaller → go left
If both are larger → go right
Otherwise → current node is LCA
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
public class binary_search_day12  {
    public TreeNode lca(TreeNode root, int p, int q) {
        if (root == null) return null;
        if (p < root.val && q < root.val) {
            return lca(root.left, p, q);
        }
        if (p > root.val && q > root.val) {
            return lca(root.right, p, q);
        }
        return root;
    }
    public static void main(String[] args) {
       binary_search_day12  obj = new binary_search_day12 ();

        /*
                6
               / \
              2   8
             / \ / \
            0  4 7  9
              / \
             3   5
        */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        int p = 2, q = 8;
        TreeNode ans = obj.lca(root, p, q);
        System.out.println("LCA: " + ans.val);
    }
}

