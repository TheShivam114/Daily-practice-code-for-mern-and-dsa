
/*Traversing and Reversing an ArrayList in Java
Objective:
Write a Java program that demonstrates how to store, traverse, and reverse elements using the ArrayList class from the Java Collections Framework.
Description:
Create an ArrayList of integers and insert a sequence of integer values into it. First, display all the elements of the list in the order in which they were added. Then, traverse the same ArrayList in reverse order and display the elements without modifying the original list.

Requirements:
Use ArrayList<Integer> to store integer values.
Add at least five integer elements to the list.
Print all elements in forward order using a loop.
Print all elements in reverse order by iterating from the last index to the first.
Do not use any built-in reverse methods (such as Collections.reverse()).

Sample Output:
element are:
1 2 3 4 5
reverse element are:
5 4 3 2 1

Concepts Tested:
Java Collections Framework
ArrayList operations (add(), get(), size())
Loop-based traversal
Reverse iteration logic */
import java.util.ArrayList;
public class arrayList_day1a {
    public static void main(String[] args){
      ArrayList <Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println("element are:");
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();
      System.out.println("reverse element are:");

      for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
      }
    }
}
