/*
Connect N Ropes with Minimum Cost
You are given N ropes, each having a positive integer length. Your task is to connect all the ropes into a single rope.
The cost of connecting two ropes is equal to the sum of their lengths.
Find the minimum total cost required to connect all the ropes.

Objective
Return the minimum cost to connect all ropes into one.

 Input
An integer N — number of ropes
An array ropes[] of size N, where ropes[i] represents the length of the i-th rope
 Output
A single integer representing the minimum cost
 Example

Input:

N = 4
ropes = [4, 3, 2, 6]
Output:

29
 Explanation
Connect 2 and 3 → cost = 5 → ropes = [4, 5, 6]
Connect 4 and 5 → cost = 9 → ropes = [6, 9]
Connect 6 and 9 → cost = 15

 Total cost = 5 + 9 + 15 = 29
 Constraints
1 ≤ N ≤ 10^5
1 ≤ ropes[i] ≤ 10^9
 Requirements
Solve using a Min Heap (Priority Queue)
Time Complexity: O(N log N)
*/
import java.util.*;
public class heaps_day6a {
    public static void main(String[] args){
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer>pq =new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes ="+cost);
    }
}
