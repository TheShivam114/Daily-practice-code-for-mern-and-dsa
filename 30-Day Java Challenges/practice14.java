/**
Find the Sum of All Nodes in a Linked List
Difficulty

⭐ Easy

Problem Statement

Given the head node of a singly linked list, calculate the sum of all node values in the linked list.

Each node contains an integer data and a reference next to the next node.

Return the total sum of all elements stored in the linked list.

Node Structure
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
Function Description

Implement the function:

public static int sumOfNodes(Node head)
Parameters
head – The first node of the linked list.
Returns
An integer representing the sum of all node values.
Input Format
The first line contains an integer N, the number of nodes.
The second line contains N space-separated integers representing the node values.
Output Format

Print a single integer representing the sum of all nodes.

Constraints
1 ≤ N ≤ 10^5
-10^4 ≤ data ≤ 10^4
Sample Input 1
5
10 20 30 40 50
Sample Output 1
150
Explanation

The linked list is:

10 → 20 → 30 → 40 → 50 → null

Sum of all nodes:

10 + 20 + 30 + 40 + 50 = 150
Sample Input 2
4
5 15 25 35
Sample Output 2
80
Explanation
5 + 15 + 25 + 35 = 80
Expected Time Complexity
O(N)
Expected Space Complexity
O(1)
 */
import java.util.*;
public class practice14 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to calculate the sum of all nodes
    public static int sumOfNodes(Node head) {

        int sum = 0;
        Node current = head;

        while (current != null) {
            sum += current.data;
            current = current.next;
        }

        return sum;
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

        // Print the sum of all nodes
        System.out.println(sumOfNodes(head));

        sc.close();
    }
}

