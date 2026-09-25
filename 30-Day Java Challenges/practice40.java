/*
Question: Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted linked list and return the head of the merged list.

The resulting list should be made by splicing together the nodes of the first two lists.

Example 1
Input:
list1 = [1,2,4]
list2 = [1,3,4]

Output:
[1,1,2,3,4,4]
Example 2
Input:
list1 = []
list2 = []

Output:
[]
Example 3
Input:
list1 = []
list2 = [0]

Output:
[0]
Constraints
0 <= number of nodes in list1 <= 50
0 <= number of nodes in list2 <= 50
-100 <= Node.val <= 100
Both lists are sorted in non-decreasing order.
 Hint

Use two pointers:

list1 → 1 → 2 → 4
         ↑

list2 → 1 → 3 → 4
         ↑

Compare the values at both pointers and attach the smaller node to the result.

A dummy node can make the implementation much easier.

Your task

Write a complete Java program for VS Code, including:

public static void main(String[] args)

Target:

Time: O(n + m)
Space: O(1) extra space
*/
/**
 * practice40
 */
public class practice40 {

    // Definition of a linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node helps us build the result easily
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        // Compare both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // list1 = [1, 2, 4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2 = [1, 3, 4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merge both lists
        ListNode result = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(result);
    }
}
