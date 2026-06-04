/*
Find the Longest Path from Source to Destination

You are given a Directed Acyclic Graph (DAG) with 8 vertices numbered from 0 to 7.

The graph contains the following directed edges:

0 → 1
0 → 2
1 → 3
1 → 4
2 → 4
3 → 5
4 → 5
4 → 6
5 → 7
6 → 7

Given:

Source (src) = 0
Destination (dest) = 7
Task

Write a Java program to find the longest path from the source vertex to the destination vertex.

The length of a path is defined as the number of edges it contains.

If multiple paths exist, print the path having the maximum length along with its length.

Use DFS and Backtracking to solve the problem.

Input Format

No user input is required.

The graph is predefined in the program.

Output Format

Print:

Longest Path:
0 -> 1 -> 3 -> 5 -> 7

Length = 4
Graph Structure
        0
       / \
      1   2
     / \   \
    3   4   |
     \ / \  |
      5   6 |
       \   /
         7
Constraints
Number of vertices = 8
Graph is directed
Graph contains no cycles
Use DFS with recursion

Example Explanation

Possible paths from 0 to 7 are:

0 → 1 → 3 → 5 → 7
0 → 1 → 4 → 5 → 7
0 → 1 → 4 → 6 → 7
0 → 2 → 4 → 5 → 7
0 → 2 → 4 → 6 → 7

Among these, the longest paths contain 4 edges.

Therefore:

Longest Path:
0 → 1 → 3 → 5 → 7

Length = 4

This is a common DFS + Backtracking interview question that builds directly on Has Path, Print All Paths, and Count Total Paths.
*/
    import java.util.ArrayList;
public class graph_day15 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    static String longestPath = "";
    static int maxLength = -1;
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

        graph[5].add(new Edge(5, 7));

        graph[6].add(new Edge(6, 7));
    }

    // Find Longest Path
    public static void longestPath(ArrayList<Edge>[] graph,
                                   int src,
                                   int dest,
                                   String path,
                                   int length) {

        if (src == dest) {

            if (length > maxLength) {
                maxLength = length;
                longestPath = path + dest;
            }

            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);

            longestPath(graph,
                        e.dest,
                        dest,
                        path + src + " -> ",
                        length + 1);
        }
    }

    public static void main(String[] args) {

        int V = 8;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        int src = 0;
        int dest = 7;

        longestPath(graph, src, dest, "", 0);

        System.out.println("Longest Path:");
        System.out.println(longestPath);

        System.out.println("\nLength = " + maxLength);
    }
}

