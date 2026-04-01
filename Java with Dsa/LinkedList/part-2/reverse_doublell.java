/*
   Reverse a Doubly Linked List

Problem Statement

Given the head of a doubly linked list, write a program to reverse the list such that all the nodes are rearranged in reverse order.

You must reverse the list by updating the prev and next pointers of each node.

Example

Input:

1 ⇄ 2 ⇄ 3 ⇄ 4 ⇄ 5 ⇄ NULL

Output:

5 ⇄ 4 ⇄ 3 ⇄ 2 ⇄ 1 ⇄ NULL
*/
    class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class reverse_doublell {

    Node head;
    void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; 
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {

        reverse_doublell dll = new reverse_doublell();
        dll.head = new Node(1);
        dll.head.next = new Node(2);
        dll.head.next.prev = dll.head;
        dll.head.next.next = new Node(3);
        dll.head.next.next.prev = dll.head.next;
        dll.head.next.next.next = new Node(4);
        dll.head.next.next.next.prev = dll.head.next.next;
        System.out.print("Original List: ");
        dll.display();

        dll.reverse();

        System.out.print("Reversed List: ");
        dll.display();
    }
}

