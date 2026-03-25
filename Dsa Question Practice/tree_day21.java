/*
  Given a binary tree and a target node X, write a program to determine the minimum time required to burn the entire tree if the fire starts from the target node.

At each unit of time, the fire spreads from a node to its:

Left child
Right child
Parent
Input
A binary tree with N nodes
An integer X representing the target node
Output
Print the minimum time required to burn the entire tree
Example

Input:

Tree:
        1
       / \
      2   3
     / \
    4   5

Target = 5

Output:

Time to burn tree = 3
Explanation
Time 0 → Node 5 burns
Time 1 → Node 2 burns
Time 2 → Nodes 1 and 4 burn
Time 3 → Node 3 burns

Total time = 3 units

Task
Construct the binary tree
Start fire from the given target node
Spread fire to parent and children
Compute the total time to burn the tree
Constraints
1 ≤ N ≤ 10^5
All node values are unique
*/
    import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class  tree_day21 {
    static Node mapParents(Node root, Map<Node,Node> parentMap, int target) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node targetNode =null;

        while (!q.isEmpty()) {
            Node curr =q.poll();

            if (curr.data== target) {
                targetNode= curr;
            }

            if (curr.left !=null) {
                parentMap.put(curr.left, curr);
                q.add(curr.left);
            }

            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                q.add(curr.right);
            }
        }

        return targetNode;
    }

    // Step 2: Burn the tree
    static int burnTree(Node root,int target) {

        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode =mapParents(root, parentMap, target);

        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        q.add(targetNode);
        visited.add(targetNode);

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                // left child
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                    burned =true;
                }

                // right child
                if (curr.right!= null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                    burned = true;
                }

                // parent
                if (parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))) {
                    visited.add(parentMap.get(curr));
                    q.add(parentMap.get(curr));
                    burned = true;
                }
            }

            if (burned) {
                time++;
            }
        }

        return time;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 5;

        System.out.println("Time to burn tree = " + burnTree(root, target));
    }
}
