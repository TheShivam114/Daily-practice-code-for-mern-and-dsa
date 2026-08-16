/*
The K Weakest Rows in a Matrix

You are given an m x n binary matrix mat where:

1 represents a soldier
0 represents a civilian
In each row, all the 1’s (soldiers) appear before all the 0’s (civilians).
Definition of Weakness

A row i is considered weaker than a row j if:

The number of soldiers in row i is less than the number of soldiers in row j, OR
Both rows have the same number of soldiers, but i < j
 Task

Return the indices of the k weakest rows in the matrix in ascending order of weakness.

 Input
An integer matrix mat of size m x n
An integer k
 Output
An array of size k containing the indices of the weakest rows
 Example

Input:

mat = [
  [1,0,0,0],
  [1,1,1,1],
  [1,0,0,0],
  [1,0,0,0]
]
k = 2

Output:

[0, 2]
 Explanation
Row 0 → 1 soldier
Row 1 → 4 soldiers
Row 2 → 1 soldier
Row 3 → 1 soldier

 Weakest rows:

Row 0 (1 soldier, smaller index)
Row 2 (1 soldier)
 Constraints
m == mat.length
n == mat[i].length
1 ≤ m, n ≤ 100
1 ≤ k ≤ m
Each row is sorted (all 1’s before 0’s)
 Follow-up
Can you solve this using a Heap (Priority Queue)?
Can you optimize counting soldiers using Binary Search?
*/
    import java.util.*;
public class heaps_day6b {
    /* 
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
    
    public Row(int soldiers,int idx){
        this.soldiers=soldiers;
        this.idx=idx;
    }
    @Override
    public int compareTo(Row r2){
        if(this.soldiers==r2.soldiers){
            return this.idx-r2.idx;
        }
        else{
            return this.soldiers-r2.soldiers;
        }
    }
    
}*/
    public static int countSoldiers(int[] row) {
        int left = 0, right = row.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (row[mid] == 1) {
                count = mid + 1; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return count;
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; 
                }
                return a[0] - b[0]; 
            }
        );
        for (int i = 0; i < mat.length; i++) {
            int soldiers = countSoldiers(mat[i]);
            pq.add(new int[]{soldiers, i});
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[1];
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

        int k = 2;
        int[] ans = kWeakestRows(mat, k);
        System.out.println("Weakest Rows:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

