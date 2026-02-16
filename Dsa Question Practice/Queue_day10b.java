/*
The Deque interface in Java allows insertion and deletion of elements from both ends. Using:
Deque<Integer> deque = new LinkedList<>();
write a Java program to implement:
 Part A: Stack using Deque (LIFO)
Push 4 integers onto the stack.
Display the stack.
Pop one element from the stack.
Display the top element.
Display the stack after pop operation.
 Use only:
addFirst()
removeFirst()
peekFirst()
 Part B: Queue using Deque (FIFO)
Insert 4 integers into the queue.
Display the queue.
Remove one element from the queue.
Display the front element.
Display the queue after removal.
 Use only:
addLast()
removeFirst()
peekFirst()
 Requirements:
Import necessary packages.
Use Deque<Integer> with LinkedList.
Follow proper Java syntax.
Display output clearly for both Stack and Queue.
*/
import java.util.*;
public class Queue_day10b {
    static class stack{
        Deque<Integer> deque=new LinkedList<>();
        public void push(int data){
           deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args){
      stack s=new stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      System.out.println("peek="+s.peek());
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());

    }
}
