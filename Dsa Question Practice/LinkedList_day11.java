/*Floyd’s Cycle Detection Algorithm
Idea
Use two pointers:
slow → moves 1 step at a time
fast → moves 2 steps at a time
If there is a cycle, the fast pointer will eventually meet the slow pointer.
If fast reaches null, then no cycle exists.
 Algorithm
Initialize:
slow = head
fast = head
While fast != null and fast.next != null:
slow = slow.next
fast = fast.next.next
If at any point slow == fast → cycle detected
If loop ends → no cycle */
public class LinkedList_day11 {
   

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static boolean detectLoop(Node head) {
            if (head == null)
                return false;

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next; // move 
                fast = fast.next.next; 

                if (slow == fast) {
                    return true; 
                }
            }
            return false; 
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; 

            System.out.println(detectLoop(head)); 
        }
    }


