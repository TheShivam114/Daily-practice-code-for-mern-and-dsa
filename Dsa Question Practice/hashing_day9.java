/*
Iterate Through a HashSet
Write a program to store n integers in a HashSet and print all unique elements using:

Iterator
Enhanced for loop
Input Format
First line: Integer n → number of elements
Second line: n space-separated integers
 Output Format

Print the elements of the HashSet in two ways:

Using Iterator:
elements...

Using Enhanced For Loop:
elements...
 Constraints
1 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
 Example

Input:

6
1 2 3 2 4 1
Output:
Using Iterator:
1 2 3 4
Using Enhanced For Loop:
1 2 3 4
Note: Order may vary because HashSet does not maintain insertion order.
*/
import java.util.*;
public class hashing_day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("\nUsing Enhanced For Loop:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
    
