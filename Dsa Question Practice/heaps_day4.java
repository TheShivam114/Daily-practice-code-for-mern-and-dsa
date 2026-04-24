/*
Implement a Min Heap with Basic Operations
You are required to implement a Min Heap data structure from scratch (without using built-in PriorityQueue).
The heap should support the following operations efficiently:

 Operations
insert(x)
Insert an element x into the heap.
peek()
Return the minimum element in the heap without removing it.
If the heap is empty, return -1.
remove()
Remove and return the minimum element from the heap.
If the heap is empty, return -1.
 Input
An integer q — number of queries
Next q lines contain queries in the format:
1 x   → insert x
2     → peek
3     → remove
 Output
For every peek (2) and remove (3) operation, print the result.
 Example

Input:

7
1 10
1 5
2
3
2
1 2
3

Output:

5
5
10
2
 Explanation
Insert 10 → heap = [10]
Insert 5 → heap = [5, 10]
Peek → 5
Remove → removes 5 → heap = [10]
Peek → 10
Insert 2 → heap = [2, 10]
Remove → removes 2
 Constraints
1 ≤ q ≤ 10^5
-10^9 ≤ x ≤ 10^9
 Requirements
Implement heap using ArrayList or array
Maintain heap property using heapify (up & down)
Time Complexity:
Insert → O(log n)
Remove → O(log n)
Peek → O(1)
*/

   import java.util.*;
public class heaps_day4 {
    static class MinHeap {
        ArrayList<Integer> heap;
        MinHeap() {
            heap = new ArrayList<>();
        }
        public void insert(int val) {
            heap.add(val);
            heapifyUp(heap.size() - 1);
        }
        // Peek (get minimum)
        public int peek() {
            if (heap.size() == 0) return -1;
            return heap.get(0);
        }
        // Remove (delete minimum)
        public int remove() {
            if (heap.size() == 0) return -1;

            int root = heap.get(0);
            Collections.swap(heap, 0, heap.size() - 1);
            heap.remove(heap.size() - 1);
            heapifyDown(0);
            return root;
        }
        private void heapifyUp(int index) {
            while (index > 0) {
                int parent = (index - 1) / 2;
                if (heap.get(index) < heap.get(parent)) {
                    Collections.swap(heap, index, parent);
                    index = parent;
                } else {
                    break;
                }
            }
        }
        private void heapifyDown(int index) {
            int size = heap.size();
            while (index < size) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int smallest = index;
                if (left < size && heap.get(left) < heap.get(smallest)) {
                    smallest = left;
                }
                if (right < size && heap.get(right) < heap.get(smallest)) {
                    smallest = right;
                }
                if (smallest != index) {
                    Collections.swap(heap, index, smallest);
                    index = smallest;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(2);

        System.out.println("Peek: " + heap.peek()); // 2
        System.out.println("Removed: " + heap.remove()); // 2
        System.out.println("Peek: " + heap.peek()); // 5
        System.out.println("Removed: " + heap.remove()); // 5
        System.out.println("Removed: " + heap.remove()); // 10
    }
} 

