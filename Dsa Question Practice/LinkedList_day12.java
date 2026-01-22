/*To remove a cycle (loop) in a linked list, we usually do it in two steps:

1️ Detect the cycle (Floyd’s Algorithm)
2 Find the starting node of the cycle and break it

 Step-by-Step Logic (Floyd + Removal)
1. Detect the cycle
Use slow and fast pointers.
2. Find the start of the cycle
Once slow == fast, reset slow = head
Move both pointers 1 step at a time
The point where they meet again is the start of the loop
3. Remove the cycle
Traverse from the loop start to find the last node of the cycle
Set its next = null */
public class LinkedList_day12 {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void removeCycle(Node head) {
            if (head == null)
                return;

            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            // Step 1: Detect cycle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }

            // No cycle
            if (!cycle)
                return;

            // Step 2: Find start of cycle
            slow = head;

            // Special case: cycle starts at head
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

            // Step 3: Remove cycle
            fast.next = null;
        }

        // Helper method to print list
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; // cycle

            removeCycle(head);
            printList(head); // 1 -> 2 -> 3 -> 4 -> null
        }
    }
 

