/*
Kth Largest Element in a Stream
You are given a stream of integers. After each insertion, you need to report the kth
 largest element in the stream so far.

If there are fewer than k elements, return -1.

 Input
An integer k
An integer n — number of elements in the stream
An array arr[] of size n
 Output
Return an array where the i-th element represents the kth largest element after inserting the i-th element
 Example

Input:

k = 3
arr = [4, 5, 8, 2]

Output:

[-1, -1, 4, 4]
 Explanation
After inserting 4 → less than 3 elements → -1
After inserting 5 → less than 3 elements → -1
After inserting 8 → 3 elements → 3rd largest = 4
After inserting 2 → elements = [4,5,8,2] → 3rd largest = 4
 Requirements
Use a Min Heap (Priority Queue) of size k
The root of the heap will always store the kth largest element
 Constraints
1 ≤ k ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
 
*/
import java.util.*;

public class heaps_day3 {
    public static int[] kthLargest(int k, int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll(); 
            }
            if (pq.size() < k) {
                result[i] = -1;
            } else {
                result[i] = pq.peek(); // kth largest
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4, 5, 8, 2};
        int[] ans = kthLargest(k, arr);
        System.out.println("Kth Largest Elements in Stream:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
    
