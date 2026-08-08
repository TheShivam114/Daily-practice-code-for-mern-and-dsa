//reverse list
public class LinkedList_day8 {
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

        public void addFirst(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public void addEnd(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;

        }

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

        public void print() {
            if (head == null) {
                System.out.println("ll is null");
            }
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            LinkedList_day8 ll = new LinkedList_day8();
            ll.addFirst(1);
            ll.addFirst(0);
            ll.addEnd(2);
            ll.print();
            ll.reverse();
            ll.print();

        }
    }

