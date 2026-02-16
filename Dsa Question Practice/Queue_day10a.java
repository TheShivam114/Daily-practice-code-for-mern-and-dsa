/*
Using the Deque interface in Java, implement a program that performs the following operations using:
Deque<Integer> deque = new LinkedList<>();

Your program should:
Insert 5 integers into the deque:
Two elements at the front
Three elements at the rear
Display the deque after insertion.
Remove one element from the front and one element from the rear.
Display the deque after removals.
Print the front and rear elements using appropriate peek methods.
Check whether the deque is empty.
 Requirements:
Use addFirst(), addLast()
Use removeFirst(), removeLast()
Use peekFirst(), peekLast()
Use isEmpty()
Import necessary packages
Follow proper Java syntax
 Expected Output Format (Example)
Deque after insertion: [20, 10, 30, 40, 50]
Removed from front: 20
Removed from rear: 50
Deque after removal: [10, 30, 40]
Front element: 10
Rear element: 40
Is deque empty? false
*/
import java.util.*;
public class Queue_day10a {
    public static void main(String args[])
    {
        Deque<Integer> deque=new LinkedList<>();
              deque.addFirst(1);
              deque.addFirst(2);
              deque.addFirst(3);
              deque.addFirst(4);
              System.out.println(deque);
              deque.remove();
              System.out.println(deque);

              System.out.println("first el="+deque.getFirst());
              System.out.println("first el="+deque.getLast());
        }
    }

