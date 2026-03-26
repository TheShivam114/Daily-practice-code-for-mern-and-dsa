/*
Detect a Cycle in a Singly Linked List
Problem Statement
Given the head of a singly linked list, write a program to determine whether the linked list contains a cycle (loop).
A cycle exists if a node’s next pointer points to a previous node in the list instead of NULL.
Input
A singly linked list with N nodes
The list may or may not contain a cycle
Output
Print "Cycle Detected" if a loop exists
Otherwise, print "No Cycle"
Example

Input:

1 → 2 → 3 → 4 → 5
          ↑     ↓
          ← ← ← ←

Output:

Cycle Detected
Explanation
Node 5 points back to node 3, forming a loop
Hence, the linked list contains a cycle
Task
Create a singly linked list
Check whether a cycle exists
Return or print the result
Constraints
1 ≤ N ≤ 10^5
Follow-up
Can you solve this using:
Floyd’s Cycle Detection Algorithm (Tortoise and Hare)?
What is the time and space complexity?

If you want, I can also give:
*/

class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}


public class detect_cycle {
  static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast !=null &&fast.next !=null) {
            slow=slow.next;          // move 1 step
            fast =fast.next.next; 

            if (slow==fast) {
                return true;      
            }
        }
        return false;  
    }


public static void main(String[] args){
Node head = new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        if (hasCycle(head)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
}
    
}