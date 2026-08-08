/*
Delete a Node in a Binary Search Tree
You are given the root of a Binary Search Tree (BST) and an integer key. Your task is to delete the node with the given value from the BST while maintaining its properties.

Input:
Root of a BST
An integer key representing the value to delete
Output:
Return the root of the updated BST
Print the inorder traversal after deletion
Constraints:
1≤n≤10

≤Node.val≤10
9
Example:

Input:

        5
       / \
      3   6
     / \   \
    2   4   7

key = 3
Output:
2 4 5 6 7
Explanation:

When deleting a node, there are 3 cases:

Leaf node → simply remove it
One child → replace with its child
Two children → replace with inorder successor (smallest in right subtree)
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

public class binary_search_day13 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) 
            return null;

        if (key <root.val) {
            root.left =deleteNode(root.left, key);
        } 
        else if (key > root.val) {
            root.right=deleteNode(root.right, key);
        } 
        else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left ==null) return root.right;
            if (root.right == null) return root.left;
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }
    private TreeNode findMin(TreeNode root) {
        while (root.left !=null) {
            root = root.left;
        }
        return root;
    }
    public void inorder(TreeNode root) {
        if (root== null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        binary_search_day13 obj = new binary_search_day13();

        /*
                5
               / \
              3   6
             / \   \
            2   4   7
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int key = 3;
        root = obj.deleteNode(root, key);
        System.out.print("Inorder after deletion: ");
        obj.inorder(root);
    }
}


