/*Title:
Implementation of Merge Sort Algorithm on a Singly Linked List
Problem Description:
Given the head of a singly linked list containing n integer nodes, implement the Merge Sort algorithm to sort the linked list in ascending order.
Unlike arrays, linked lists do not support random access, making traditional sorting algorithms like Quick Sort inefficient. Merge Sort is particularly
well-suited for linked lists as it efficiently sorts the list by rearranging node pointers without requiring additional memory for element shifting.
Tasks to Perform:

Implement a function to find the middle node of the linked list using the slow and fast pointer technique.
Recursively divide the linked list into two halves until each sublist contains a single node.
Implement a function to merge two sorted linked lists into a single sorted linked list.
Combine the above steps to sort the entire linked list using Merge Sort.
Display the linked list before and after sorting.

Input:
A singly linked list containing n integers
Example:
4 → 2 → 1 → 3 → null
Output:
The linked list sorted in ascending order
1 → 2 → 3 → 4 → null
Constraints:
0 ≤ n ≤ 10⁵
-10⁹ ≤ Node.data ≤ 10⁹
Expected Time and Space Complexity:
Time Complexity: O(n log n)
Auxiliary Space Complexity: O(log n) (due to recursion stack)
Key Concepts Used:
Linked List traversal
Divide and Conquer
Recursion
Slow and Fast Pointer Technique
Merge two sorted linked lists */
public class LinkedList_day13 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    //  Merge Sort 
    public static Node mergeSort(Node head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // recursive calls
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        return merge(left, right);
    }

    // Find Mid 
    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge Two Sorted Lists 
    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // remaining nodes
        if (head1 != null) temp.next = head1;
        else temp.next = head2;

        return dummy.next;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.print("Before sorting: ");
        print(head);

        head = mergeSort(head);

        System.out.print("After sorting:  ");
        print(head);
    }
}


