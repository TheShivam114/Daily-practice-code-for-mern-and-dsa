/*
Maintain Unique Elements in Insertion Order
You are given n integers. Store them in a LinkedHashSet and print all unique elements while preserving their insertion order.
A LinkedHashSet:
Stores only unique elements
Maintains insertion order internally using a Doubly Linked List (DLL)
 Input Format
First line: Integer n
Second line: n space-separated integers
 Output Format

Print all unique elements in the same order they were first inserted.

 Constraints
1 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
 Example 1

Input:

7
5 2 1 2 5 7 1
Output:
5 2 1 7
 Example 2

Input:
6
10 20 30 20 10 40
Output:
10 20 30 40
 Hint

Unlike HashSet, LinkedHashSet preserves insertion order.
*/
import java.util.*;
public class hashing_day10a {
    public static void main(String[] args){
        HashSet<String>cities=new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
         lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);

        lhs.remove("delhi");
        System.out.println(lhs);
    }
}
