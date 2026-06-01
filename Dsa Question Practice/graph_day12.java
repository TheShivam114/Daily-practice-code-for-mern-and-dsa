/*
Count Total Number of Paths Between Source and Destination
You are given a Directed Graph consisting of 6 vertices numbered from 0 to 5.
The graph contains the following directed edges:

0 → 1
0 → 2
1 → 3
2 → 3
3 → 4
1 → 4
4 → 5

Given:

Source (src) = 0
Destination (dest) = 5
Task
Write a Java program to determine the total number of distinct paths from the source vertex to the destination vertex.
A path is considered distinct if the sequence of vertices visited is different.
Use Depth First Search (DFS) with recursion to explore all possible routes from the source to the destination.

Input Format

No user input is required.

The graph is predefined in the program.

Output Format

Print the total number of distinct paths from src to dest.

Example Output
Total Paths = 3
Explanation

The graph contains the following paths from vertex 0 to vertex 5:

0 → 1 → 3 → 4 → 5
0 → 1 → 4 → 5
0 → 2 → 3 → 4 → 5

Since there are 3 distinct paths, the output is:

Total Paths = 3
Graph Structure
        0
       / \
      1   2
     / \   \
    3   4   \
     \ /     \
      4 ----> 5
Constraints
Number of vertices = 6
Graph is directed
Use DFS and recursion
Return the count of all possible paths
Time Complexity: O(V + E) for traversal of each path
*/
    import java.util.ArrayList;
public class graph_day12  {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 5));
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

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int dest = 5;

        int totalPaths = countPaths(graph, src, dest);

        System.out.println("Total Paths = " + totalPaths);
    }
}

