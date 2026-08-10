
/*Find the Maximum Element in an ArrayList
Objective:
Develop a Java program to determine the maximum value stored in an ArrayList of integers.
Description:
You are given an ArrayList containing multiple integer elements. Traverse the list using an iterative approach and identify the largest element present. The program should display the maximum value after completing the traversal.
Requirements:
Use ArrayList<Integer> to store integer values.
Insert at least five integer elements into the list.
Initialize a variable to track the maximum value.
Traverse the ArrayList using a loop and compare each element to find the maximum.
Print the maximum element at the end of the program.
Do not use any built-in utility methods such as Collections.max().
Sample Input:
ArrayList elements: 2, 5, 9, 3, 6
Sample Output:
max value is : 9

Concepts Tested:
Java Collections Framework (ArrayList)
Loop-based traversal
Conditional comparison
Use of Integer.MIN_VALUE
Problem-solving using iteration

Time Complexity:
O(n), where n is the number of elements in the list.
Space Complexity:
O(1) (constant extra space) */
import java.util.ArrayList;

public class arrayList_day1b {
    public static void main(String[] args){
        ArrayList <Integer> list=new ArrayList<>();
      list.add(2);
      list.add(5);
      list.add(9);
      list.add(3);
      list.add(6);
      int max=Integer.MIN_VALUE;
      for(int i=0;i<list.size();i++){
        // if(max<list.get(i))
        //     max=list.get(i);

        max=Math.max(max, list.get(i));
      }
      System.out.println("max value is :"+max);
    }
    
}
