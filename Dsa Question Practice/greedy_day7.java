/*
Activity Selection with Unsorted Input (Greedy Algorithm)
You are given N activities, where each activity is represented by its start time and end time. A single person can perform only one activity at a time.
Unlike the standard version of the problem, the activities are not sorted in any particular order.
Your task is to:
Sort the activities in ascending order of their end times.
Apply the Greedy Activity Selection algorithm.
Determine and return the maximum number of non-overlapping activities that can be performed.
Input:
start[] = {5, 1, 3, 0, 8}
end[]   = {9, 2, 4, 6, 9}
Each start[i] and end[i] represent the start and finish time of the ith activity.
Output:
Return an integer representing the maximum number of activities that can be scheduled without overlap.
Constraints:
1 ≤ N ≤ 10^5
0 ≤ start[i] < end[i] ≤ 10^9
Expected Output:
4
*/import java.util.Arrays;
import java.util.Comparator;
public class greedy_day7 {
    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;

        // Step 1: Store activities in object array
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], end[i]);
        }

        // Step 2: Sort by end time
        Arrays.sort(activities, new Comparator<Activity>() {
            public int compare(Activity a, Activity b) {
                return a.end - b.end;
            }
        });

        // Step 3: Apply Greedy Algorithm
        int count = 1;
        int lastEnd = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = {5, 1, 3, 0, 8};
        int[] end   = {9, 2, 4, 6, 9};

        int result = maxActivities(start, end);
        System.out.println("Maximum number of activities: " + result);
    }
}
    
