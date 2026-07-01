/*
Count the Number of Nodes in a Linked List

A Node class is provided:

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

Write a function:

public static int countNodes(Node head)

that returns the total number of nodes in the linked list.

Input

The first line contains an integer N, the number of nodes.

The next N lines contain the node values.

Sample Input
5
10
20
30
40
50

The linked list is:

10 → 20 → 30 → 40 → 50 → null
Sample Output
5
Example 2
Input
0

The linked list is empty.

Output
0
Your Task

Complete only this method:

public static int countNodes(Node head) {
    // Your code here
}
Constraints
0 ≤ N ≤ 1000
Expected Time Complexity
O(n)
Hint (Don't look unless you need it!)
Create a counter variable.
Start from head.
Move through the list until you reach null.
Increment the counter for each node.
Return the counter.
Challenge ⭐

After solving this, try these without help:

Find the sum of all nodes.
Find the maximum value in the linked list.
Search for a given value in the linked list.
Reverse the linked list.
Delete the first node.
Delete the last node.

These questions progress from easy to intermediate and are commonly asked in coding interviews and platforms like HackerRank and LeetCode.
*/

    import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class day27 {

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    public static int countNodes(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.println(countNodes(head));

        sc.close();
    }
}
