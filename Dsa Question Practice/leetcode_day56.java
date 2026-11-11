/*

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
Example 1
Input:  head = [1, 2, 3, 4, 5]
Output: [3, 4, 5]

Explanation:
The middle node is 3.










en.rattibha.com


Example 2
Input:  head = [1, 2, 3, 4, 5, 6]
Output: [4, 5, 6]

Explanation:
There are two middle nodes (3 and 4).
Return the second middle node (4).


Example 3
Input:  head = [1]
Output: [1]


Constraints
- Number of nodes: 1 to 100.
- 1 <= Node.val <= 100
Your Challenge
Solve this problem using the Slow and Fast Pointer approach.

Hint:
- Slow pointer moves one step.
- Fast pointer moves two steps.
- When fast reaches the end, slow will be at the middle.
Expected Java Structure
Write a complete runnable Java program with:
- class ListNode
- public class Main
- main() method
- A method middleNode() that returns the middle node.
*/
    
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class leetcode_day56 {

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = middleNode(head);

        System.out.println("Middle Node: " + middle.val);
    }
}


