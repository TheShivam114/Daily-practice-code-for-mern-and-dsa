
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

public class greedy_Day13  {

    public static void main(String[] args) {

        Job[] jobs = {
                new Job('A', 4, 20),
                new Job('B', 1, 10),
                new Job('C', 1, 40),
                new Job('D', 1, 30)
        };

        jobSequencing(jobs);
    }

    public static void jobSequencing(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean[] slots = new boolean[maxDeadline];
        char[] result = new char[maxDeadline];
        int totalProfit = 0;
        for (Job job : jobs) {
            // Try to schedule from last possible slot
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (!slots[j]) {
                    slots[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        System.out.print("Selected Jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slots[i]) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("\nMaximum Profit: " + totalProfit);
    }
}
