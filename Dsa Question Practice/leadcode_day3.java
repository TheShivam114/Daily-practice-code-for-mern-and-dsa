/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/
   import java.util.*;

public class leadcode_day3 {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add digit from first list
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add digit from second list
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Create new node
            current.next = new ListNode(sum % 10);

            // Move current
            current = current.next;

            // Calculate carry
            carry = sum / 10;
        }

        return dummy.next;
    }

    // Create linked list from array
    public static ListNode createList(int[] arr) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
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

        // 342
        int[] arr1 = {2, 4, 3};

        // 465
        int[] arr2 = {5, 6, 4};

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Result:");
        printList(result);
    }
}