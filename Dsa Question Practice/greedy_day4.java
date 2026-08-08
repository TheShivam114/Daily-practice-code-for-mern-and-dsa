/*
  Modify the Activity Selection algorithm to print the indices of selected activities instead of just counting them.
   Input: start[] = {10, 12, 20} end[] = {20, 25, 30}
*/
public class greedy_day4 {
    public static void selectActivities(int[] start, int[] end) {
        int n = start.length;
        System.out.print("Selected Activities: ");
        // Select first activity
        int lastEnd = end[0];
        System.out.print("A0 ");

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEnd) {
                System.out.print("A" + i + " ");
                lastEnd = end[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] start = {10, 12, 20};
        int[] end   = {20, 25, 30};

        selectActivities(start, end);
    }
}
    