/*
Merge Two Binary Search Trees

You are given the roots of two Binary Search Trees, root1 and root2. Your task is to merge them into a single sorted list containing all the elements from both trees.

Input:
Root of BST root1
Root of BST root2
Output:
Return a list of integers containing all elements from both BSTs in sorted order
Constraints:
1≤n,m≤10
5
−10
9
≤Node.val≤10
9
Example:

Input:

Tree 1:        Tree 2:
   2              1
  / \              \
 1   4              3
Output:
[1, 1, 2, 3, 4]
Explanation:
Inorder traversal of BST gives sorted arrays:
Tree 1 → [1, 2, 4]
Tree 2 → [1, 3]
Merge both sorted arrays → [1, 1, 2, 3, 4]
💡 Hint:
Perform inorder traversal on both trees
Merge the two sorted lists (like merge step in merge sort)
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

public class binary_search_day14 {
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }
        while (i < list1.size()) result.add(list1.get(i++));
        while (j < list2.size()) result.add(list2.get(j++));

        return result;
    }
    public List<Integer> mergeBSTs(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        return mergeLists(list1, list2);
    }
    public static void main(String[] args) {
        binary_search_day14 obj = new binary_search_day14();

        /*
            Tree 1:
                2
               / \
              1   4

            Tree 2:
                1
                 \
                  3
        */

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);
        List<Integer> result = obj.mergeBSTs(root1, root2);
        System.out.println("Merged Sorted List: " + result);
    }
}

