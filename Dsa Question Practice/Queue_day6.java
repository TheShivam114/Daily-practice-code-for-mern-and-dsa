// Circular Queue using Linked List
public class Queue_day6 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front = null;
        Node rear = null;
        public boolean isEmpty() {
            return front == null;
        }

        // Add element
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                rear.next = front; 
                return;
            }
            rear.next = newNode;
            rear = newNode;
            rear.next = front; 
        }
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = front.data;
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front; 
            }

            return result;
        }
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }

        // Display queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        q.display();  

        System.out.println("Removed: " + q.remove());

        q.display();  

        System.out.println("Peek: " + q.peek());
    }
}


