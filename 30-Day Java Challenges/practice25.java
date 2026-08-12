/*
Reverse a Singly Linked List
Difficulty

⭐⭐ Medium

Problem Statement

You are given the head of a singly linked list. Your task is to reverse the linked list and return the new head.

A singly linked list contains nodes where each node has:

data
next

For example:

1 → 2 → 3 → 4 → 5 → null

After reversing:

5 → 4 → 3 → 2 → 1 → null
Node Structure

Use the following Node class:

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
Function Description

Implement:

public static Node reverseList(Node head)
Parameters
head – The first node of the linked list.
Returns
The new head of the reversed linked list.
Input Format

The first line contains an integer:

N

The second line contains N space-separated integers representing the linked list.

Output Format

Print the elements of the reversed linked list separated by spaces.

Constraints
1 ≤ N ≤ 10^5
-10^4 ≤ data ≤ 10^4
Sample Input
5
1 2 3 4 5
Sample Output
5 4 3 2 1
*/
import java.util.*;

public class practice25 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            // Save the next node
            Node next = current.next;

            // Reverse the current node's pointer
            current.next = prev;

            // Move prev forward
            prev = current;

            // Move current forward
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < N; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Reverse the linked list
        head = reverseList(head);

        // Print reversed list
        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" ");
            }

            current = current.next;
        }

        sc.close();
    }
}
