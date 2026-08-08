/*
Check if a Path Exists in a Graph

You are given an undirected graph with 7 vertices numbered from 0 to 6.

The graph connections are:

0 → 1
0 → 2
1 → 3
2 → 4
3 → 4
3 → 5
4 → 5
5 → 6

You are also given:

src = 0
dest = 5
Task

Write a Java program to determine whether a valid path exists from src to dest.

A path exists if you can travel from the source vertex to the destination vertex through connected edges.

Use DFS (Depth First Search) to solve the problem.

Input Format

No user input required.

Output Format

Print:

true

if a path exists, otherwise print:

false
Example
Input
src = 0
dest = 5
Output
true
Graph Structure
        0
      /   \
     1     2
      \   /
       3---4
        \ /
         5
         |
         6
Constraints
Number of vertices = 7
Graph is undirected
Use ArrayList<Integer>[] for graph representation
Use recursion with DFS
Hint

Use a recursive DFS function:
*/
    import java.util.ArrayList;
public class graph_day8 {
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
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        // 3 -> 1,4,5
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        // 4 -> 2,3,5
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        // 5 -> 3,4,6
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        // 6 -> 5
        graph[6].add(new Edge(6, 5));
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,
                                  int src,
                                  int dest,
                                  boolean visited[]) {
        if (src == dest) {
            return true;
        }

        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);

            if (!visited[e.dest]) {

                boolean found = hasPath(graph,
                                        e.dest,
                                        dest,
                                        visited);

                if (found) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        int src = 0;
        int dest = 5;

        boolean visited[] = new boolean[V];

        System.out.println(
                hasPath(graph, src, dest, visited)
        );
    }
}

