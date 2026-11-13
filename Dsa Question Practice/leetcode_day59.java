/*
Reverse Linked List
Easy
Linked List
Two Pointers

LeetCode: Reverse Linked List – Problem 206
Problem
Given the head of a singly linked list, reverse the list and return the reversed list.
Example 1
Input:
head = [1, 2, 3, 4, 5]


Output:
[5, 4, 3, 2, 1]


Explanation:

Original Linked List:
1

2

3

4

5


Before reversing

5

4

3

2

1


After reversing

Example 2
Input:
head = [1, 2]


Output:
[2, 1]


Example 3
Input:
head = []


Output:
[]


Constraints
- Number of nodes: 0 to 5000
- -5000 <= Node.val <= 5000
Your Challenge
Solve this problem using an Iterative Approach (Three Pointers).

Hint:

Use three pointers:
1. prev – Stores the previous node.
2. curr – Points to the current node.
3. next – Temporarily stores the next node.
The main logic:
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;


Expected Java Structure
Write a complete Java program containing:
- class ListNode
- public class Main
- main() method
- reverseList() method
*/
    
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class leetcode_day59 {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // Store the next node
            ListNode next = curr.next;

            // Reverse the link
            curr.next = prev;

            // Move prev forward
            prev = curr;

            // Move curr forward
            curr = next;
        }

        return prev;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creating Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse Linked List
        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

