/*
You are given the coordinates of N cars on a 2D plane, where each car is represented by a point (x, y).
You are standing at the origin (0, 0). Your task is to find the K nearest cars to your current location.
The distance between two points is calculated using the Euclidean distance:

distance=
x
2
+y
2
 Objective

Return the indices (or identifiers) of the K cars that are closest to the origin.
 Input
An integer N — number of cars
A list of N points:
cars[i] = (xi, yi)
An integer K
 Output
Return a list of K car indices representing the nearest cars
 Example
Input:
N = 3
cars = [(3,3), (5,-1), (-2,4)]
K = 2
Output:

[0, 2]
 Explanation
Distance of car 0 → √(3² + 3²) = √18
Distance of car 1 → √(5² + (-1)²) = √26
Distance of car 2 → √((-2)² + 4²) = √20

 The two closest cars are:

Car 0
Car 2
 Constraints
1 ≤ K ≤ N ≤ 10^5
-10^4 ≤ xi, yi ≤ 10^4
 Requirements
Solve using a Heap (Priority Queue)
Optimize to O(N log K) time complexity
*/
    import java.util.*;

public class heaps_day5 {

    static class Car {
        int x, y, index;
        int dist;

        Car(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
            this.dist = x * x + y * y; 
        }
    }
    public static List<Integer> kNearest(int[][] cars, int k) {
        PriorityQueue<Car> pq = new PriorityQueue<>(
            (a, b) -> b.dist - a.dist
        );

        for (int i = 0; i < cars.length; i++) {
            int x = cars[i][0];
            int y = cars[i][1];

            pq.add(new Car(x, y, i));
            if (pq.size() > k) {
                pq.poll(); // remove farthest
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().index);
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] cars = {
            {3, 3},
            {5, -1},
            {-2, 4}
        };

        int k = 2;

        List<Integer> ans = kNearest(cars, k);
        System.out.println("K Nearest Cars (indices): " + ans);
    }
}

