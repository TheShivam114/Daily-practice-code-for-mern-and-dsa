
  /*
  Build a Binary Search Tree from Given Values

You are given an array of integers. Your task is to construct a Binary Search Tree (BST) by inserting the elements of the array one by one in the given order.

Input:
An integer array arr[] of size n
Output:
Return the root of the constructed BST
Print the inorder traversal of the tree
Constraints:

1≤n≤10

≤arr[i]≤10
9
Example:

Input:

arr = [5, 3, 7, 2, 4, 8]
Output:
2 3 4 5 7 8
Explanation:
Insert elements one by one:
5 → root
3 → left of 5
7 → right of 5
2 → left of 3
4 → right of 3
8 → right of 7
Inorder traversal of BST gives sorted order
💡 Hint:
Use recursion to insert nodes
Follow BST rule:
smaller → left
greater → right
🔥 Follow-up:
What is the time complexity in worst case?
How can you balance the BST?
What happens if the array is already sorted?
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

public class binary_search_day4 {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
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
        binary_search_day4 obj = new binary_search_day4();

        int[] arr = {5, 3, 7, 2, 4, 8};

        TreeNode root = null;

        // Build BST
        for (int val : arr) {
            root = obj.insert(root, val);
        }

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        obj.inorder(root);
    }
} 

