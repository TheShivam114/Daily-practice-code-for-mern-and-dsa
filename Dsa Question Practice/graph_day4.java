/*
   Problem Statement

You are given an undirected graph with V vertices numbered from 0 to V-1, along with two vertices src and dest.
Your task is to determine whether there exists a valid path between src and dest.
A path exists if you can travel from the source vertex to the destination vertex through one or more connected edges.
Input Format
First line contains an integer V representing the number of vertices.
Second line contains an integer E representing the number of edges.
Next E lines contain two space-separated integers u and v representing an undirected edge.
Last line contains two integers:
src → source vertex
dest → destination vertex
Constraints
1 ≤ V ≤ 10^5
0 ≤ E ≤ 10^5
0 ≤ src, dest < V
Sample Input
5
4
0 1
0 2
1 3
2 4
0 4
Sample Output
true
Explanation
There exists a path from vertex 0 to vertex 4.

Path:
0 → 2 → 4

Therefore, the output is true.
*/import java.util.ArrayList;
import java.util.Scanner;

public class graph_day4 {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // DFS function
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

                boolean found =
                        hasPath(graph,
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

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph
            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }
        int src = sc.nextInt();
        int dest = sc.nextInt();

        boolean visited[] = new boolean[V];

        boolean ans =
                hasPath(graph,
                        src,
                        dest,
                        visited);

        System.out.println(ans);

        sc.close();
    }
}