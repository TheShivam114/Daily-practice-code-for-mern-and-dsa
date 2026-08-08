/*
Breadth First Search (BFS) Traversal
Problem Statement

You are given an undirected graph containing V vertices numbered from 0 to V-1. Your task is to perform a Breadth First Search (BFS) traversal starting from
 vertex 0 and print the order in which the vertices are visited.
BFS explores all neighboring vertices level by level using a queue data structure.

Input Format
First line contains an integer V representing the number of vertices.
Second line contains an integer E representing the number of edges.
Next E lines contain two space-separated integers u and v representing an undirected edge between vertices u and v.
Constraints
1 ≤ V ≤ 10^5
0 ≤ E ≤ 10^5
Sample Input
5
4
0 1
0 2
1 3
2 4
Sample Output
0 1 2 3 4
Explanation
Start BFS from node 0
Visit 0
→ enqueue neighbors 1 and 2
Visit 1
→ enqueue neighbor 3
Visit 2
→ enqueue neighbor 4

Visit 3
Visit 4
Traversal Order:
0 1 2 3 4
*/
    import java.util.*;
public class graph_day2 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void bfs(ArrayList<Edge>[] graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 4));
        graph[4].add(new Edge(4, 2));
        bfs(graph, V);
    }
}

