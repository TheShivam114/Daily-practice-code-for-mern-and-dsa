/*Swap Elements and Sort an ArrayList in Java
Objective
Write a Java program to perform element swapping and sorting operations on an ArrayList<Integer>.
Description
You are given an ArrayList<Integer> containing integer values. First, swap the elements present at the second and fourth positions of the list (using zero-based indexing, indices 1 and 3). After performing the swap operation, sort the updated list in ascending order and display the final result.

Input
An ArrayList<Integer> containing integer values.
Sample Input:

List = [2, 5, 9, 3, 6]
Operations to Perform
Swap elements at index 1 and index 3
Sort the ArrayList in ascending order
Output
Display the list after swapping
Display the list after sorting
Sample Output:

After Swapping: [2, 3, 9, 5, 6]
After Sorting:  [2, 3, 5, 6, 9]

Requirements
Use ArrayList<Integer> from the Java Collections Framework.
Perform swapping using index-based access and a temporary variable.
Sort the list using an appropriate sorting technique.
Do not modify the size of the list.
Display the list at each major step.
Constraints
The list contains at least 4 elements.
All elements are integers in the range −10⁶ to 10⁶.
Index positions used for swapping are valid.
Concepts Tested
Java Collections Framework
ArrayList indexing
Swapping elements using a temporary variable
Sorting techniques
Time and space complexity analysis
Expected Time Complexity
Swapping: O(1)
Sorting: O(n log n)
Expected Space Complexity
O(1) (in-place operations) */
import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
public class arrayList_day3b {
   public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("in descending order:");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
   }
}
