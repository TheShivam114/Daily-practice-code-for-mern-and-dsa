/*
Print All Root-to-Leaf Paths in a Binary Tree
You are given the root of a binary tree. Your task is to print all paths from the root node to every leaf node.
A leaf node is a node that has no left and right children.

Input:
Root of a binary tree
Output:
Print all root-to-leaf paths
Each path should be printed in a separate line
Constraints:

1≤n≤10
5
Example:

Input:

        1
       / \
      2   3
       \
        5
Output:
1 -> 2 -> 5
1 -> 3
💡 Hint:
Use recursion (DFS)
Maintain a list (or string) to store the current path
When you reach a leaf node → print path
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
public class binary_search_day8 {
    public void printPaths(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path);
    }
    private void dfs(TreeNode node, List<Integer> path) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            printPath(path);
        } else {
            dfs(node.left, path);
            dfs(node.right, path);
        }
        path.remove(path.size() - 1);
    }

    private void printPath(List<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
               \
                5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        binary_search_day8 obj = new binary_search_day8();
        System.out.println("Root to Leaf Paths:");
        obj.printPaths(root);
    }
}

