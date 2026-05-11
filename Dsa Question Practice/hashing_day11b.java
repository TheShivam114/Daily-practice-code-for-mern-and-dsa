/*
Union and Intersection of Two Arrays
You are given two integer arrays. Your task is to find:


Union of the two arrays


Contains all unique elements present in either array.




Intersection of the two arrays


Contains all common elements present in both arrays.




Print the total count of union elements and intersection elements.
Input
arr1 = {7, 3, 9}arr2 = {6, 3, 9, 2, 9, 4}
Output
Union Count = 6Intersection Count = 2
Explanation
Union Elements
{7, 3, 9, 6, 2, 4}
Total unique elements = 6
Intersection Elements
{3, 9}
Total common elements = 2
Constraints


1≤n,m≤1051 \le n, m \le 10^51≤n,m≤105


−109≤arr[i]≤109-10^9 \le arr[i] \le 10^9−109≤arr[i]≤109


Hint
Use HashSet for efficient insertion and searching operations.
*/
    import java.util.*;

public class hashing_day11b  {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Output
        System.out.println("Union Count = " + union.size());
        System.out.println("Union Elements = " + union);
        System.out.println("Intersection Count = " + intersection.size());
        System.out.println("Intersection Elements = " + intersection);
    }
}

