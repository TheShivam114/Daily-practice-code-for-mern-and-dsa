/*
Implementation of Doubly Linked List with Basic Operations

Problem Statement

Write a program to implement a Doubly Linked List (DLL) and perform the following operations:

Insertion at the beginning
Insertion at the end
Deletion from the beginning
Deletion from the end
Display the list (forward traversal)

A doubly linked list is a linear data structure in which each node contains:

Data
Pointer to the previous node
Pointer to the next node
Input
A sequence of operations to be performed on the doubly linked list
Output
Display the list after performing the operations
Example

Input Operations:

Insert at beginning: 10  
Insert at beginning: 5  
Insert at end: 20  
Delete from beginning  

Output:

10 ⇄ 20
Explanation
Insert 10 → 10
Insert 5 → 5 ⇄ 10
Insert 20 → 5 ⇄ 10 ⇄ 20
Delete from beginning → 10 ⇄ 20
Task
Create a node structure with:
data
prev
next
Implement all required operations
Display the final list
Constraints
1 ≤ N ≤ 10^5
*/
    class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class doubly_ll{

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        doubly_ll dll = new doubly_ll();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(5);
        dll.insertAtEnd(20);

        System.out.print("List: ");
        dll.display();

        dll.deleteFromBeginning();

        System.out.print("After deletion: ");
        dll.display();
    }
}

