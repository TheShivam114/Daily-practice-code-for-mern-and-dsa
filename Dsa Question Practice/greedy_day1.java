/*
   Activity Selection Problem (Greedy Algorithm)
You are given n activities, where each activity has a start time and an end time. A single person can perform only one activity at a time.
The activities are already sorted in ascending order of their end times.
Your task is to determine the maximum number of non-overlapping activities that can be performed by the person.

Input:
Two arrays:
start[] = {10, 12, 20}
end[] = {20, 25, 30}
Each start[i] and end[i] represents the start and end time of the ith activity.

Output:
Return the maximum number of activities that can be performed without overlapping.
Expected Output:
2
(The selected activities are A0 and A2.)
*/
public class greedy_day1 {
    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;
        int count = 1;
        int lastEnd = end[0];

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};

        int result = maxActivities(start, end);
        System.out.println("Maximum number of activities: " + result);
    }


}
