/*
    Insert a Node in a Binary Search Tree
You are given the root of a Binary Search Tree (BST) and an integer value val. Your task is to insert the given value into the BST while maintaining its properties.

Input:
Root of a BST
An integer val to insert
Output:
Return the root of the updated BST
Print the inorder traversal after insertion
Constraints:

1≤n≤10

≤Node.val≤10
9
Example:

Input:

      4
     / \
    2   7
   / \
  1   3

val = 5
Output:
1 2 3 4 5 7
💡 Hint:
Compare val with current node
Move left or right accordingly
Insert when you reach a null position
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

public class binary_search_day5 {
    public TreeNode insert(TreeNode root, int val) {
        if (root ==null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        binary_search_day5 obj = new binary_search_day5();

        /*
              4
             / \
            2   7
           / \
          1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 5;
        root = obj.insert(root, val);
        System.out.print("Inorder after insertion: ");
        obj.inorder(root);
    }
}
