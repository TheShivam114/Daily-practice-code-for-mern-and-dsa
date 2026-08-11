
    //  Reverse linked list
    // Search element
    public class LinkedList_day7 {

        public class node {
            int data;
            node next;

            public node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static node head;
        public static node tail;
        public static int size;

        // Add at beginning
        public void addFirst(int data) {
            node newnode = new node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // Add at end
        public void addEnd(int data) {
            node newnode = new node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        // Add at any index
        public void addAnywhere(int indx, int data) {
            if (indx == 0) {
                addFirst(data);
                return;
            }
            node newnode = new node(data);
            size++;

            node temp = head;
            int i = 0;
            while (i < indx - 1) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

        // Remove first node
        public int removeFirst() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // Remove last node
        public int removeLast() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            }
            if (head.next == null) {
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        // Remove at specific index
        public void removeAtIndex(int index) {
            if (index == 0) {
                removeFirst();
                return;
            }

            node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;
        }

        // Search element 
        public int search(int key) {
            node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return idx;
                }
                temp = temp.next;
                idx++;
            }
            return -1;
        }

        // Reverse linked list
        public void reverse() {
            node prev = null;
            node curr = head;
            node next;

            tail = head;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // Print linked list
        public void print() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            LinkedList_day7 ll = new LinkedList_day7();

            ll.addFirst(1);
            ll.addFirst(0);
            ll.addEnd(2);
            ll.addAnywhere(1, 9);
            ll.print();

            ll.removeFirst();
            ll.print();

            ll.removeLast();
            ll.print();

            System.out.println("Index of 9: " + ll.search(9));

            ll.reverse();
            ll.print();

            System.out.println("Size: " + size);
        }
    }


