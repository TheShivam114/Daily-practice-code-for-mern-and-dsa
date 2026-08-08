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
Expected Function Signature
*/
    import java.util.ArrayList;
public class graph_day13 {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
     static void createGraph(ArrayList<Edge>[] graph) {
        
     }
    
    public static void main(String[] args) {

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        int src = 0;
        int dest = 6;

    }
}

