/*
Count Total Number of Paths in a Directed Graph

You are given a Directed Acyclic Graph (DAG) with 7 vertices numbered from 0 to 6.

The graph contains the following directed edges:

0 → 1
0 → 2
1 → 3
1 → 4
2 → 4
3 → 5
4 → 5
4 → 6
5 → 6

Given:

Source (src) = 0
Destination (dest) = 6
Task

Write a Java program to calculate the total number of distinct paths from the source vertex to the destination vertex.

A path is considered distinct if it follows a different sequence of vertices.

Use Depth First Search (DFS) with recursion to solve the problem.

Input Format

No user input is required.

The graph is predefined in the program.

Output Format

Print the total number of distinct paths from src to dest.

Example Output
Total Paths = 4
Explanation

The distinct paths from vertex 0 to vertex 6 are:

0 → 1 → 3 → 5 → 6
0 → 1 → 4 → 5 → 6
0 → 1 → 4 → 6
0 → 2 → 4 → 5 → 6
0 → 2 → 4 → 6

Therefore:

Total Paths = 5
Graph Structure
        0
       / \
      1   2
     / \   \
    3   4---\
     \ / \   \
      5---\   6
       \_____/
Constraints
Number of vertices = 7
Graph is directed
Graph contains no cycles
Use DFS with recursion
Return only the count of paths
Expected Function Signature*/

    import java.util.ArrayList;
public class  graph_day14 {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 6));
        graph[5].add(new Edge(5, 6));
    }
    public static int countPaths(ArrayList<Edge>[] graph,
                                 int src,
                                 int dest) {

        if (src == dest) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);

            count += countPaths(graph, e.dest, dest);
        }

        return count;
    }

    public static void main(String[] args) {

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        int src = 0;
        int dest = 6;

        int totalPaths = countPaths(graph, src, dest);

        System.out.println("Total Paths = " + totalPaths);
    }
}
