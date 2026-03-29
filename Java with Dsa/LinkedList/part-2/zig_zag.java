/*
  Zig-Zag Rearrangement of a Singly Linked List

Problem Statement

Given the head of a singly linked list, write a program to rearrange the nodes in zig-zag fashion such that the node values follow an alternating pattern:

a < b > c < d > e < f ...

That is:

The first node should be less than the second
The second node should be greater than the third
The third node should be less than the fourth, and so on
Input
Head of a singly linked list with N nodes
Output
Modify the linked list in-place to follow the zig-zag pattern
Print the updated list
Example

Input:

1 → 4 → 3 → 2 → 5

Output:

1 → 4 → 2 → 5 → 3
Explanation
1 < 4 
4 > 2 
2 < 5 
5 > 3 

Thus, the list follows the required zig-zag order

Task
Traverse the linked list
Compare adjacent nodes
Swap nodes where the zig-zag condition is violated
Continue until the end of the list
Constraints
1 ≤ N ≤ 10^5
Follow-up
Can you solve this in O(n) time complexity?
Can you do it using constant extra space (O(1))?
*/
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class zig_zag {
    static void zigZag(Node head) {
        if (head == null) return;
        boolean flag = true; // true: < , false: >
        Node curr = head;

        while (curr.next != null) {

            if (flag) {
                // Expect curr.data < curr.next.data
                if (curr.data > curr.next.data) {
                    // swap
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
            } else {
                // Expect curr.data > curr.next.data
                if (curr.data < curr.next.data) {
                    // swap
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
            }
            curr = curr.next;
            flag = !flag; // toggle condition
        }
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        zigZag(head);

        System.out.print("Zig-Zag List: ");
        printList(head);
    }
}

