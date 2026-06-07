
    /*
Find the Shortest Path from Source to Destination

You are given a Directed Graph with 7 vertices numbered from 0 to 6.

The graph contains the following directed edges:

0 → 1
0 → 2
1 → 3
2 → 3
2 → 4
3 → 5
4 → 5
5 → 6

Given:

Source (src) = 0
Destination (dest) = 6
Task

Write a Java program to find the shortest path from the source vertex to the destination vertex.

The shortest path is the path containing the minimum number of edges.

Use DFS with Backtracking to explore all possible paths and determine the shortest one.

Input Format

No user input is required.

The graph is predefined in the program.

Output Format

Print:

Shortest Path:
0 -> 1 -> 3 -> 5 -> 6

Length = 4
Graph Structure
        0
       / \
      1   2
      |  / \
      3    4
       \  /
        5
        |
        6
Explanation

Possible paths from 0 to 6 are:

0 -> 1 -> 3 -> 5 -> 6
0 -> 2 -> 3 -> 5 -> 6
0 -> 2 -> 4 -> 5 -> 6

Each path contains 4 edges, so any one of them can be considered a shortest path.

Constraints
Number of vertices = 7
Graph is directed
Graph contains no cycles
Use DFS and recursion
Use backtracking to compare path lengths
Expected Function Signature
public static void shortestPath(
        ArrayList<Edge>[] graph,
        int src,
        int dest,
        String path,
        int length)
*/
import java.util.ArrayList;

public class graph_day17 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static String shortestPath = "";
    static int minLength = Integer.MAX_VALUE;
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));
    }
    public static void shortestPath(ArrayList<Edge>[] graph,
                                    int src,
                                    int dest,
                                    String path,
                                    int length) {

        // Base Case
        if (src == dest) {
            if (length < minLength) {
                minLength = length;
                shortestPath = path + dest;
            }
            return;
        }
        // DFS Traversal
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            shortestPath(graph,
                         e.dest,
                         dest,
                         path + src + " -> ",
                         length + 1);
        }
    }

    public static void main(String[] args) {

        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int dest = 6;
        shortestPath(graph, src, dest, "", 0);
        System.out.println("Shortest Path : " + shortestPath);
        System.out.println("Length = " + minLength);
    }
}