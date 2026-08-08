/*
     o compute the diameter of a binary tree in linear time, we calculate height and diameter together in a single traversal.

Key Idea 💡

Instead of calling the height() function multiple times (which gives O(n²)), we:

Compute height while calculating diameter

Use a helper function that returns height

Update diameter using a reference (or global variable)

Algorithm

Traverse the tree using recursion.

For each node:

Compute left height

Compute right height

Update diameter as:
diameter = max(diameter, leftHeight + rightHeight + 1)

Return height:
1 + max(leftHeight, rightHeight)
*/
    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree_day13{

    static int diameter = 0;

    static int height(Node root) {
        if (root ==null) {
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight =height(root.right);

        // Update diameter
        diameter = Math.max(diameter,leftHeight +rightHeight + 1);

        // Return height
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);

        System.out.println("Diameter of tree = " +diameter);
    }
}

