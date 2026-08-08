/*
Print All Paths from Source to Destination in a Directed Graph

You are given a Directed Graph consisting of 6 vertices numbered from 0 to 5.

The graph contains the following directed edges:

5 → 0
5 → 2
4 → 0
4 → 1
0 → 3
2 → 3
3 → 1

Given:

Source (S) = 5
Destination (D) = 1

Your task is to find and print all possible paths from the source vertex 5 to the destination vertex 1.

Objective

Implement a Java program that uses Depth First Search (DFS) and Backtracking to explore every possible route from the source node to the destination node.

Input Format

No user input is required.

The graph is predefined as shown above.

Output Format

Print each valid path from the source to the destination on a separate line.

Example Output
5 -> 0 -> 3 -> 1
5 -> 2 -> 3 -> 1
Graph Representation
        5 -----> 0 <----- 4
        |        |
        |        v
        v        3 -----> 1
        2 -------^        ^
                          |
                          4
Constraints
Number of vertices = 6
Graph is Directed
No cycles are present in the graph
Use DFS with recursion
Print all possible paths in the order they are discovered
Sample Explanation

There are two distinct paths from vertex 5 to vertex 1:

5 → 0 → 3 → 1
5 → 2 → 3 → 1

Hence, both paths should be printed.
*/
    import java.util.ArrayList;
public class graph_day10 {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
    }
    public static void printAllPaths(
            ArrayList<Edge>[] graph,
            int src,
            int dest,
            String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPaths(
                    graph,
                    e.dest,
                    dest,
                    path + src + " -> "
            );
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 5;
        int dest = 1;
        System.out.println("All Paths from " + src + " to " + dest + ":");

        printAllPaths(graph, src, dest, "");
    }
}

