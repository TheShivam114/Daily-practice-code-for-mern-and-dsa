/*A Circular Queue is an efficient data structure that overcomes the limitations of a simple 
linear queue by treating the last position of the array as connected to the first position, forming a circular structure.
You are required to implement a Circular Queue using an array in Java.

Requirements
Implement the following operations:
enqueue(int data)
Insert an element into the circular queue.
dequeue()
Remove and return the front element of the queue.
peek()
Display the front element without removing it.
isEmpty()
Check whether the queue is empty.
isFull()
Check whether the queue is full.
Constraints
Use a fixed-size array
Initially, front = -1 and rear = -1
Queue should follow FIFO (First In First Out)
Handle overflow and underflow conditions properly
Input / Output (Example)

Operations
enqueue(10)
enqueue(20)
enqueue(30)
dequeue()
enqueue(40)
peek()


Output
Dequeued element: 10
Front element: 20
Expected Time Complexity
enqueue() → O(1)
dequeue() → O(1)
Bonus
Explain how a Circular Queue improves memory utilization compared to a Linear Queue. */

class Queue_day3{
    int[] arr;
    int front, rear, size;
    Queue_day3(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full (Overflow)");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
        System.out.println(data + " inserted");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
            return -1;
        }

        int result = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return result;
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.print(arr[rear]);
        System.out.println();
    }
}

