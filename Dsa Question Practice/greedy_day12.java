/*
   Job Sequencing with Deadlines (Greedy Algorithm Problem)
You are given a set of jobs, where each job is characterized by:
A unique job ID
A deadline (an integer ≥ 1)
A profit earned if the job is completed on or before its deadline
Each job requires exactly one unit of time to complete, and only one job can be processed at a time.
Your task is to determine an optimal schedule that maximizes the total profit, ensuring that no job is executed after its deadline.

Input:
Job ID	Deadline	Profit
A	4	20
B	1	10
C	1	40
D	1	30
Output:
The sequence of jobs that maximizes total profit.
The maximum total profit obtained.
Constraints:
1 ≤ Number of Jobs ≤ N
1 ≤ Deadline ≤ N
Profit ≥ 0
*/ 
import java.util.*;
class Job {
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class greedy_day12 {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 4, 20),
            new Job('B', 1, 10),
            new Job('C', 1, 40),
            new Job('D', 1, 30)
        };
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean[] slot = new boolean[maxDeadline];
        char[] result = new char[maxDeadline];

        int totalProfit = 0;
        for (Job job : jobs) {
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        System.out.println("Scheduled Jobs:");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }
}

