
/*Swap Two Elements in an ArrayList by Their Positions
Objective:
Write a Java program to swap two elements in an ArrayList<Integer> based on their index positions.
Description:
You are given an ArrayList of integers. Swap the elements located at the second and fourth positions of the list (index positions 1 and 3 using zero-based indexing). After performing the swap operation, display the updated list.

Input:
An ArrayList<Integer> containing integer values.
Sample Input:
List = [2, 5, 9, 3, 6]
Operation to Perform:
Swap elements at index 1 and index 3
Output:
The updated ArrayList after swapping the specified elements.
Sample Output:
List after swapping = [2, 3, 9, 5, 6]
Requirements:
Use ArrayList<Integer> from the Java Collections Framework.
Perform the swap using index-based access.
Do not create an additional list.
Do not use built-in utility methods such as Collections.swap().
Display the list before and after swapping.
Constraints:
The list contains at least 4 elements.
Index positions are valid.
Preserve the order of all other elements.
Concepts Tested:
Java Collections Framework
ArrayList indexing
Element swapping logic
Use of temporary variables
Time Complexity:
O(1)
Space Complexity:
O(1) */
import java.util.ArrayList;
public class arrayList_day3a {

    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int tmp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, tmp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
          int idx1=1;
          int idx2=3;
          System.out.println(list);
          swap(list, idx1, idx2);
          System.out.println(list);
    }
}
