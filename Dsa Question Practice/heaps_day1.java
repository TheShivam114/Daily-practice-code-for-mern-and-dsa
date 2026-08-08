/*
You are given a list of tasks where each task has a priority and a processing time. Your goal is to simulate a task scheduler that
always executes the highest-priority task first.
If two tasks have the same priority, the one with the smaller processing time should be executed first.
 Input
An integer n — number of tasks

A list of n tasks, where each task is represented as:

(taskId, priority, processingTime)
 Output
Return the order of execution of task IDs.
 Example

Input:

n = 4
tasks = [
  (1, 3, 5),
  (2, 1, 2),
  (3, 3, 2),
  (4, 2, 4)
]

Output:

[3, 1, 4, 2]
 Explanation
Task 1 and 3 have highest priority (3)
Between them, Task 3 has smaller processing time → executed first
Then Task 1
Next priority is 2 → Task 4
Finally Task 2 (priority 1)
 Constraints
1 ≤ n ≤ 10^5
1 ≤ priority ≤ 10^9
1 ≤ processingTime ≤ 10^9
 Requirements
Solve using a Priority Queue (Max Heap / Min Heap with custom comparator)
Time Complexity should be O(n log n)
*/
    import java.util.*;

// Task class
class Task {
    int taskId;
    int priority;
    int processingTime;

    Task(int taskId, int priority, int processingTime) {
        this.taskId = taskId;
        this.priority = priority;
        this.processingTime = processingTime;
    }
}

public class heaps_day1 {

    public static List<Integer> scheduleTasks(List<Task> tasks) {
        
        // Priority Queue with custom comparator
        PriorityQueue<Task> pq = new PriorityQueue<>(
            (a, b) -> {
                // Higher priority first
                if (b.priority != a.priority) {
                    return b.priority - a.priority;
                }
                // If priority same → smaller processing time first
                return a.processingTime - b.processingTime;
            }
        );

        // Add all tasks to PQ
        pq.addAll(tasks);

        List<Integer> result = new ArrayList<>();

        // Process tasks
        while (!pq.isEmpty()) {
            Task current = pq.poll();
            result.add(current.taskId);
        }

        return result;
    }

    public static void main(String[] args) {
        
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1, 3, 5));
        tasks.add(new Task(2, 1, 2));
        tasks.add(new Task(3, 3, 2));
        tasks.add(new Task(4, 2, 4));

        List<Integer> executionOrder = scheduleTasks(tasks);

        System.out.println("Execution Order: " + executionOrder);
    }
}
