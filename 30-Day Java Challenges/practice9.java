/**
Reverse the First K Elements of a Queue
Difficulty
 Easy–Medium

Problem Statement

Given a queue containing N integers and an integer K, reverse the order of the first K elements of the queue while keeping the remaining elements in their original order.

Print the modified queue after performing the operation.

Function Description

Implement the function:

public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int K)
Parameters
queue – A queue containing N integers.
K – The number of elements to reverse from the front of the queue.
Returns
A queue with the first K elements reversed.
Input Format
The first line contains two integers:
N K
The second line contains N space-separated integers representing the queue elements from front to rear.
Output Format

Print the elements of the modified queue from front to rear.

Constraints
1 ≤ K ≤ N ≤ 10^5
1 ≤ queue[i] ≤ 10^9
Sample Input
5 3
10 20 30 40 50
Sample Output
30 20 10 40 50
Explanation

Original Queue:

Front → 10 20 30 40 50 ← Rear

Reverse the first 3 elements:

10 20 30

becomes

30 20 10

The remaining elements (40 and 50) stay in the same order.

Final Queue:

30 20 10 40 50
Sample Input 2
6 4
1 2 3 4 5 6
Sample Output 2
4 3 2 1 5 6
Expected Time Complexity
O(N)
Expected Space Complexity
O(K)
 */
import java.util.*;
public class practice9 {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int K) {

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first K elements into stack
        for (int i = 0; i < K; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Add them back to queue (reversed)
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Step 3: Move remaining elements to the back
        int remaining = queue.size() - K;

        for (int i = 0; i < remaining; i++) {
            queue.offer(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.offer(sc.nextInt());
        }

        queue = reverseFirstK(queue, K);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        sc.close();
    }
}
    
