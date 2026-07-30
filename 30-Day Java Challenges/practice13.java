import java.util.*;

public class practice13 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to count nodes
    public static int countNodes(Node head) {

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Creating linked list
        for (int i = 0; i < N; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } 
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Calling function
        System.out.println(countNodes(head));

        sc.close();
    }
}