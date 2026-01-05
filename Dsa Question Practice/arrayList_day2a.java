/*
Store and Print Only Odd Numbers from an ArrayList
Objective:
Write a Java program to extract all odd numbers from a given ArrayList and store them in a new list.
Description:
You are given an ArrayList containing integer values. Traverse the list and identify all odd numbers. Add only the odd elements to a new ArrayList. Finally, print the elements of the new list.
Requirements:
Use ArrayList<Integer> to store integer elements.
Insert at least five integer values into the original list.
Traverse the list using a loop.
Check each element to determine whether it is odd.
Add only odd numbers to a new ArrayList.
Print the elements of the new list.
Do not modify the original list.
Sample Input:
Original List: [2, 5, 9, 3, 6, 8]

Sample Output:
Odd Numbers List: [5, 9, 3]

Constraints:
The list contains only integers.
Order of elements must be preserved.
Do not use Java Streams or built-in filtering methods.
Concepts Tested:
Java Collections Framework
Conditional statements
ArrayList traversal
Data filtering logic

Time Complexity:
O(n)
Space Complexity:
O(n) (for storing odd numbers)
 */
import java.util.ArrayList;
public class arrayList_day2a {
    public static void main(String[] args){
       ArrayList<Integer> list=new ArrayList<>();
       list.add(2);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6);
       list.add(8);
      ArrayList<Integer> oddnum =new ArrayList<>();
      for(int i=0;i<list.size();i++){
        if(list.get(i)%2!=0){
            oddnum.add(list.get(i));
        }
      }

      for(int i=0;i<oddnum.size();i++){
        System.out.print(oddnum.get(i)+" ");
      }
    //   System.out.println(oddnum);
       
    }
}
