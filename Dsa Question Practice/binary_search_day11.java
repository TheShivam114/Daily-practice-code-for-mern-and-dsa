/*
Convert a Binary Search Tree to a Balanced BST
You are given the root of a Binary Search Tree (BST). Your task is to convert it into a height-balanced BST.
A BST is considered balanced if the height difference between the left and right subtrees of every node is at most 1.

Input:
Root of a BST
Output:
Return the root of a balanced BST
Constraints:

1≤n≤10
5
Example:

Input (Skewed BST):

1
 \
  2
   \
    3
     \
      4
Output (Balanced BST):
    3
   / \
  2   4
 /
1
💡 Hint:
Store BST nodes in inorder (sorted array)
Build BST from sorted array (middle element as root)

*/
    import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class  binary_search_day11 {
    public void inorder(TreeNode root, List<Integer> list) {
        if (root== null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public TreeNode buildBalanced(List<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildBalanced(list, start, mid - 1);
        root.right = buildBalanced(list, mid + 1, end);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        inorder(root, list);
        return buildBalanced(list, 0, list.size() - 1);
    }
    public void inorderPrint(TreeNode root) {
        if (root == null) return;

        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }
    public static void main(String[] args) {
         binary_search_day11 obj = new  binary_search_day11();

        /*
            1
             \
              2
               \
                3
                 \
                  4
        */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        TreeNode balancedRoot = obj.balanceBST(root);
        System.out.print("Inorder of Balanced BST: ");
        obj.inorderPrint(balancedRoot);
    }
}

