/*Merge Two Sorted ArrayLists into a Single Sorted ArrayList

Objective:
Write a Java program to merge two sorted ArrayList<Integer> objects into a new sorted ArrayList.
Description:
You are given two ArrayList<Integer> instances, each containing integers sorted in ascending order. Your task is to merge these two lists into a third ArrayList such that the resulting list is also sorted in ascending order and contains all elements from both input lists.

Input:
First sorted ArrayList<Integer>
Second sorted ArrayList<Integer>

Output:
A new ArrayList<Integer> containing all elements from both lists in sorted order
Requirements:
Use ArrayList<Integer> from the Java Collections Framework.
Do not modify the original ArrayLists.
Do not use built-in sorting or merging methods such as Collections.sort() or addAll() followed by sorting.
Maintain the sorted order during the merge process.
Allow duplicate elements in the merged list.
Sample Input:
List1 = [1, 2, 3, 5]
List2 = [2, 4, 6, 7]
Sample Output:
Merged List = [1, 2, 2, 3, 4, 5, 6, 7]

Constraints:
1 ≤ size of each ArrayList ≤ 10⁵
Elements are integers in the range −10⁶ to 10⁶
Both ArrayLists are already sorted in ascending order
Concepts Tested:
Java Collections Framework
ArrayList traversal
Two-pointer technique
Data merging algorithms
Time and space complexity analysis
Expected Time Complexity:
O(n + m), where n and m are the sizes of the two lists.
Expected Space Complexity:
O(n + m) for the merged list. */

import java.util.ArrayList;
public class arrayList_day2b {
    public static void main(String[] args){
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(7);
        ArrayList<Integer> newarry=new ArrayList<>();

        int i=0 ,j=0;
        while (i<list1.size()&& j<list2.size()) {
            if(list1.get(i)<=list2.get(j)){
                newarry.add(list1.get(i++));
                // i++;
            }
            else{
                newarry.add(list2.get(j++));
            }
            
        }
        while(i<list1.size()){
            newarry.add(list1.get(i++));
        }
        while(j<list1.size()){
            newarry.add(list2.get(j++));
        }
        System.out.println(newarry);
    }
}
