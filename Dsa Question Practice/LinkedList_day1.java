public class LinkedList_day1 {

    // Node class
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail of the Linked List
    public static Node head;
    public static Node tail;

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

   

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   


    // Main method
    public static void main(String[] args) {
        LinkedList_day1 ll = new LinkedList_day1();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.printList(); 

        ll.removeFirst();
        ll.printList(); // 10 -> 30 -> 40 -> null
        ll.printList(); // 10 -> 30 -> null

        System.out.println("Search 30: " + ll.search(30));
        System.out.println("Search 100: " + ll.search(100));
    }
}
