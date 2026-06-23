/*
Minimum Difference

You are given a class named DifferenceCalculator with a private integer array elements and a public integer minimumDifference.

Task

Complete the DifferenceCalculator class by:

Writing a constructor that stores the given array in elements.
Writing a method computeMinimumDifference() that finds the smallest absolute difference between any two different elements in the array and stores it in minimumDifference.
Input Format
The first line contains an integer n, the size of the array.
The second line contains n space-separated integers.
Constraints
2 ≤ n ≤ 100
0 ≤ elements[i] ≤ 1000
Output Format

Print the value of minimumDifference.

Sample Input
5
1 8 3 10 5
Sample Output
2
Explanation

The absolute differences are:

|1 - 3| = 2
|3 - 5| = 2
|5 - 8| = 3
|8 - 10| = 2

The smallest absolute difference is 2.
*/
    import java.util.*;
class DifferenceCalculator {
    private int[] elements;
    public int minimumDifference;
    DifferenceCalculator(int[] elements) {
        this.elements = elements;
    }
    public void computeMinimumDifference() {
        minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);

                if (diff < minimumDifference) {
                    minimumDifference = diff;
                }
            }
        }
    }
}

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DifferenceCalculator dc = new DifferenceCalculator(arr);
        dc.computeMinimumDifference();
        System.out.println(dc.minimumDifference);
        sc.close();
    }
}

