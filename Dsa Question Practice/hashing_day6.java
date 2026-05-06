/*
Sorted Key-Value Store
 Problem Statement

You are given q queries. Implement a data structure using a TreeMap that supports the following operations:
put key value → Insert or update the key with the given value
get key → Print the value associated with the key, or -1 if not present
remove key → Remove the key from the map
printSorted → Print all key-value pairs in ascending order of keys
 Input Format
First line: Integer q (number of queries)
Next q lines: One of the operations:
put key value
get key
remove key
printSorted
Output Format
For each get → print value or -1

For printSorted → print:

key1:value1 key2:value2 ...
 Constraints
1 ≤ q ≤ 10^5
-10^9 ≤ key, value ≤ 10^9
 Example

Input:

6
put 3 30
put 1 10
put 2 20
printSorted
get 2
remove 2

Output:

1:10 2:20 3:30
20
*/
   import java.util.*;
public class hashing_day6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (q-- > 0) {
            String op = sc.next();

            if (op.equals("put")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                map.put(key, value);

            } else if (op.equals("get")) {
                int key = sc.nextInt();
                System.out.println(map.getOrDefault(key, -1));

            } else if (op.equals("remove")) {
                int key = sc.nextInt();
                map.remove(key);

            } else if (op.equals("printSorted")) {
                for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                    System.out.print(e.getKey() + ":" + e.getValue() + " ");
                }
                System.out.println();
            }
        }
    }
} 

