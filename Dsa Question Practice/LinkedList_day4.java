// Search an element
// Remove last element

    public class LinkedList_day4 {
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

        // Remove last element
        public void removeLast() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }

            if (head.next == null) {
                head = tail = null;
                return;
            }

            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }

        // Search an element
        public boolean search(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        // Main method
        public static void main(String[] args) {
            LinkedList_day4 ll = new LinkedList_day4();

            ll.addFirst(10);
            ll.addFirst(20);
            ll.addLast(30);
            ll.addLast(40);

            ll.printList(); // 20 -> 10 -> 30 -> 40 -> null

            ll.removeFirst();
            ll.printList(); // 10 -> 30 -> 40 -> null

            ll.removeLast();
            ll.printList(); // 10 -> 30 -> null

            System.out.println("Search 30: " + ll.search(30));
            System.out.println("Search 100: " + ll.search(100));
        }
    }


