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
*/

import java.util.ArrayList;
public class graph_day3 {
     static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
         for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
    }
}
