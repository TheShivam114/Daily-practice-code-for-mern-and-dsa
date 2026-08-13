/*
Find the Middle Node
Given the head of a singly linked list, find and return the middle node of the linked list.

If the linked list contains an even number of nodes, return the second middle node.

Example 1
Input:
1 → 2 → 3 → 4 → 5

Output:
3
Example 2
Input:
1 → 2 → 3 → 4 → 5 → 6

Output:
4

For 6 nodes, the two middle nodes are 3 and 4, so we return 4.

Function Description

Implement:

public static Node findMiddle(Node head)
Parameters
head – The first node of the linked list.
Returns
The middle node of the linked list.
Input Format
N
a1 a2 a3 ... aN

Where N is the number of nodes.

Output Format

Print the data stored in the middle node.

Constraints
1 ≤ N ≤ 100000
-10000 ≤ data ≤ 10000
Sample Input
7
10 20 30 40 50 60 70
Sample Output
40
Explanation

The linked list is:

10 → 20 → 30 → 40 → 50 → 60 → 70

The middle node is:

40
*/
    import java.util.*;
    
    public class practice26 {
    
        // Node class
        static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        // Function to find the middle node
        public static Node findMiddle(Node head) {
    
            Node slow = head;
            Node fast = head;
    
            // Move slow by 1 step and fast by 2 steps
            while (fast != null && fast.next != null) {
    
                slow = slow.next;
                fast = fast.next.next;
            }
    
            return slow;
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            int N = sc.nextInt();
    
            Node head = null;
            Node tail = null;
    
            // Create the linked list
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
    
            // Find middle
            Node middle = findMiddle(head);
    
            // Print middle value
            System.out.println(middle.data);
    
            sc.close();
        }
    }