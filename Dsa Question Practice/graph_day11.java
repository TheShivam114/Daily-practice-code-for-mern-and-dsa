/*
Statement: Dijkstra's Algorithm – Shortest Path

You are given a weighted directed graph with 6 vertices (0 to 5). The graph is represented by the following edges:

Source	Destination	Weight
0	1	2
0	2	4
1	2	1
1	3	7
2	4	3
4	3	2
3	5	1
4	5	5

Using Dijkstra's Algorithm, find the shortest distance from source vertex 0 to all other vertices.

Input

No user input is required. Consider the graph as given above.

Output

Print the shortest distance from vertex 0 to every other vertex.

Example Output
Vertex 0 -> Distance = 0
Vertex 1 -> Distance = 2
Vertex 2 -> Distance = 3
Vertex 3 -> Distance = 8
Vertex 4 -> Distance = 6
Vertex 5 -> Distance = 9
*/
    import java.util.*;
public class graph_day11 {
    static class Edge {
        int dest, weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node, dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
        public int compareTo(Pair p) {
            return this.dist - p.dist;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (!visited[curr.node]) {
                visited[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int u = curr.node;
                    int v = e.dest;
                    int wt = e.weight;

                    if (dist[u] != Integer.MAX_VALUE &&
                        dist[u] + wt < dist[v]) {

                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " -> Distance = " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));
        graph[1].add(new Edge(2, 1));
        graph[1].add(new Edge(3, 7));
        graph[2].add(new Edge(4, 3));
        graph[4].add(new Edge(3, 2));
        graph[4].add(new Edge(5, 5));

        graph[3].add(new Edge(5, 1));
        dijkstra(graph, 0);
    }
}

