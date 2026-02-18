/*
Question 1: Basic Activity Selection
You are given two arrays start[] and end[] representing start and finish times of activities. Activities are sorted by their finish times.
Write a program to determine the maximum number of non-overlapping activities that can be performed by a single person.
Example:
start[] = {1, 3, 0, 5, 8, 5}
end[]   = {2, 4, 6, 7, 9, 9}

Expected Output:
4
*/
public class greedy_day2 {
    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;

        // Select first activity
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
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        int result = maxActivities(start, end);
        System.out.println("Maximum number of activities: " + result);
    }
}


