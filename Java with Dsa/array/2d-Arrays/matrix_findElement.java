import java.util.Scanner;

public class matrix_findElement {
    public static boolean searchElement(int metrix[][], int key) {
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                if (metrix[i][j] == key) {
                    System.out.println("element fount " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }

        System.out.println(" not found ");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int metrix[][] = new int[3][3];
        int n = metrix.length, m = metrix[0].length;
        System.out.println("enter element of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                metrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("element are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println();

        }
        int a = 5;
        searchElement(metrix, a);
    }
}