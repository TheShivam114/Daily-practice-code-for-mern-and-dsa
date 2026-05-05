/*
LRU Cache using LinkedHashMap
Design and implement a Least Recently Used (LRU) Cache using a LinkedHashMap.
 Problem Statement

You are given a cache with a fixed capacity. Implement a data structure that supports the following operations:

get(int key)
Returns the value of the key if it exists in the cache.
Otherwise, return -1.
Accessing a key makes it recently used.
put(int key, int value)
Insert or update the value of the key.
If the cache exceeds its capacity, remove the least recently used (LRU) key.
📥 Input Format
First line: Integer capacity
Second line: Integer q (number of operations)
Next q lines:
"get key"
"put key value"
 Output Format
For each get operation, print the result.
 Constraints
1 ≤ capacity ≤ 10^4
1 ≤ q ≤ 10^5
0 ≤ key, value ≤ 10^9
 Example

Input:

2
5
put 1 10
put 2 20
get 1
put 3 30
get 2

Output:

10
-1
*/

   import java.util.*;

class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    public void put(int key, int value) {
        map.put(key, value);
    }
}

public class hashing_day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int q = sc.nextInt();

        LRUCache cache = new LRUCache(capacity);

        while (q-- > 0) {
            String op = sc.next();

            if (op.equals("get")) {
                int key = sc.nextInt();
                System.out.println(cache.get(key));
            } else if (op.equals("put")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                cache.put(key, value);
            }
        }
    }
}