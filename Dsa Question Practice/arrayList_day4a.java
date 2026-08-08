
/*Create a main ArrayList that stores multiple ArrayList<Integer> objects. Each inner ArrayList should store a sequence of integers generated using a mathematical pattern.
 Populate three inner lists such that:
The first list contains the first five natural numbers.
The second list contains the first five multiples of 2.
The third list contains the first five multiples of 3.
Add all inner lists to the main ArrayList. Display the complete two-dimensional structure and then print each element row-wise using nested loops.
Input
No user input is required.
All values are generated programmatically.

Output
Print the complete two-dimensional ArrayList.
Print the elements of each inner list on a new line.
Sample Output
[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
Requirements
Use ArrayList<ArrayList<Integer>> to represent a two-dimensional list.
Populate inner lists using a loop and arithmetic operations.
Add each inner list to the main list.
Traverse the two-dimensional list using nested loops.
Print elements in a row-wise format.
Constraints
Each inner list must contain exactly 5 elements.
Values must be positive integers.
Do not use arrays or built-in matrix classes.
Concepts Tested
Java Collections Framework
Two-dimensional ArrayList
Nested loops
Dynamic data structures
List traversal techniques
Time Complexity
O(n × m), where n is the number of inner lists and m is the number of elements in each list.
Space Complexity
O(n × m) */
import java.util.*;
public class arrayList_day4a {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }



    }
}
