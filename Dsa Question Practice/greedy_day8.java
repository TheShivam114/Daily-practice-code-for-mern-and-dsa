/*
  Activities Not Sorted You are given activities that are not sorted by end time. 
  Write a program to: Sort activities according to their end times.
   Apply the greedy approach. Return the maximum number of activities. 
   Input:
    start[] = {5, 1, 3, 0, 8}
    end[] = {9, 2, 4, 6, 9}
*/ import java.util.Arrays;
import java.util.Comparator;
public class greedy_day8 {
    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], end[i]);
        }
        Arrays.sort(activities, new Comparator<Activity>() {
            public int compare(Activity a, Activity b) {
                return a.end - b.end;
            }
        });
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
