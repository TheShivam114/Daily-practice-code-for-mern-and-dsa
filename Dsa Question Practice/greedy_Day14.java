/*
   Minimum Cost to Break a Chocolate Bar
You are given a rectangular chocolate bar consisting of m × n unit square pieces.
 Your objective is to break the chocolate into individual 1 × 1 squares.
Breaking the chocolate can only be done along the grid lines that separate the squares.
 Each break incurs a cost, which is determined solely by the line along which the break is made — not by 
 the size of the piece being broken.
The costs of breaking along the vertical lines are given as:
The costs of breaking along the horizontal lines are given as:
Each break divides one piece of chocolate into two smaller pieces, and the cost of each break must be paid at the time the break is performed.

Objective

Determine the minimum total cost required to break the entire chocolate bar into individual unit squares (1 × 1 pieces).
*/ 
 import java.util.*;
public class greedy_Day14 {
    public static int minimumCost(int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        int i = x.length - 1;  // largest vertical cost
        int j = y.length - 1;  // largest horizontal cost
        int horizontalPieces = 1;
        int verticalPieces = 1;
        int totalCost = 0;

        while (i >= 0 && j >= 0) {
            if (x[i] > y[j]) {
                totalCost += x[i] * horizontalPieces;
                verticalPieces++;
                i--;
            } else {
                totalCost += y[j] * verticalPieces;
                horizontalPieces++;
                j--;
            }
        }
        while (i >= 0) {
            totalCost += x[i] * horizontalPieces;
            i--;
        }
        while (j >= 0) {
            totalCost += y[j] * verticalPieces;
            j--;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] x = {2, 1, 3, 1, 4};  // vertical costs
        int[] y = {4, 1, 2};       // horizontal costs

        System.out.println("Minimum Cost: " + minimumCost(x, y));
    }
}
}
