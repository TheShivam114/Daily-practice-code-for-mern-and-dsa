/*
Count Distinct Elements

You are given an array of integers. Your task is to count how many distinct elements are present in the array.

Two elements are considered distinct if they have different values.

Input Format
First line contains an integer n — size of the array.
Second line contains n space-separated integers.
Output Format

Print a single integer representing the number of distinct elements in the array.

Constraints
1≤n≤10
5
−10
9
≤arr[i]≤10
9
Example
Input
9
4 3 2 5 6 7 3 4 2
Output
7
Explanation

Distinct elements are:
{4, 3, 2, 5, 6, 7}
*/

    import java.util.*;
public class hashing_day11a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }
        System.out.println(set.size());
    }
}
