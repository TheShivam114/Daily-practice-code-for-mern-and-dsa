/*
   Convert Sorted Array to Height-Balanced BST
You are given a sorted array of integers nums in ascending order.

Your task is to convert it into a height-balanced Binary Search Tree (BST).

A BST is height-balanced if the depth of the two subtrees of every node never differs by more than 1.

Input
An integer array nums of size n
1 ≤ n ≤ 10^5
-10^5 ≤ nums[i] ≤ 10^5
 Output
Return the root node of the constructed height-balanced BST
 Example
Input:
nums = [-10, -3, 0, 5, 9]
Output:
      0
     / \
   -3   9
   /   /
 -10  5

(Any valid height-balanced BST is accepted)

 Constraints
Array is already sorted
Must maintain BST properties
Tree should be balanced
 Hint
Use Divide and Conquer
Pick the middle element as root
Recursively build left and right subtree
*/
    import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class binary_search_day10 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }
    // Helper function (Divide & Conquer)
    private static TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        return root;
    }
    // Inorder Traversal (to verify BST)
    public static void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Preorder Traversal (to see structure)
    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void levelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        TreeNode root = sortedArrayToBST(nums);
        // Output
        System.out.println("\nInorder Traversal (Sorted):");
        inorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);
        System.out.println("\nLevel Order Traversal:");
        levelOrder(root);
        sc.close();
    }
}

