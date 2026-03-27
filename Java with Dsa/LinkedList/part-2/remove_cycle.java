/*
  Remove Cycle from a Singly Linked List

Problem Statement

Given the head of a singly linked list that may contain a cycle (loop), write a program to detect and remove the cycle so that the linked list becomes a linear (acyclic) list.

You must modify the list in-place without using extra space.

Input
A singly linked list with N nodes
The list may contain a cycle
Output
If a cycle exists:
Remove the cycle
Print "Cycle Removed"
If no cycle exists:
Print "No Cycle Found"
Example

Input:

1 → 2 → 3 → 4 → 5
          ↑     ↓
          ← ← ← ←

Output:

Cycle Removed
Explanation
Node 5 points back to node 3, forming a cycle
After removal, the list becomes:
1 → 2 → 3 → 4 → 5 → NULL
Task
Detect whether a cycle exists in the linked list
If a cycle exists:
Find the starting node of the cycle
Remove the cycle by updating pointers
Ensure the final list ends with NULL
Constraints
1 ≤ N ≤ 10^5
Follow-up
Can you solve this using:
Floyd’s Cycle Detection Algorithm?
How do you find the starting point of the cycle?
What is the time and space complexity?
*/
    class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class remove_cycle {
    static void removeCycle(Node head) {
        if (head==null) return;

        Node slow =head;
        Node fast =head;
        boolean cycle= false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle) {
            System.out.println("No Cycle Found");
            return;
        }
        slow = head;

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;

        System.out.println("Cycle Removed");
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
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 → 3
        head.next.next.next.next.next = head.next.next;
        removeCycle(head);
        printList(head);
    }
}

