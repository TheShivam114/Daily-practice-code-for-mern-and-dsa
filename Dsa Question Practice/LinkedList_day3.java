//remove first element

    public class LinkedList_day3 {

        // Node class
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
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

        // Add element at the end
        public void addLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
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

        // Remove first element
        public void removeFirst() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }

            head = head.next;
        }

        public static void main(String[] args) {
            LinkedList_day3 ll = new LinkedList_day3();

            ll.addFirst(10);
            ll.addFirst(20);
            ll.addLast(30);
            ll.addLast(40);

            ll.printList(); // 20 -> 10 -> 30 -> 40 -> null

            ll.removeFirst();
            ll.printList(); // 10 -> 30 -> 40 -> null

            ll.printList(); // 10 -> 30 -> null
        }
    }


