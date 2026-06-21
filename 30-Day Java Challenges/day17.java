/*
  import java.io.*;
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int min = elements[0];
        int max = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        maximumDifference = Math.abs(max - min);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Difference d = new Difference(a);
        d.computeDifference();

        System.out.println(d.maximumDifference);

        sc.close();
    }
}
*/
    import java.io.*;
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int min = elements[0];
        int max = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        maximumDifference = Math.abs(max - min);
    }
}

public class day17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Difference d = new Difference(a);
        d.computeDifference();

        System.out.println(d.maximumDifference);

        sc.close();
    }
}

