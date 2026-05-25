/* 
Create and Represent a Weighted Graph

You are given a weighted undirected graph with 5 vertices numbered from 0 to 4.
The graph contains the following weighted edges:

Edge between 0 and 1 with weight 5
Edge between 1 and 2 with weight 1
Edge between 1 and 3 with weight 3
Edge between 2 and 3 with weight 1
Edge between 2 and 4 with weight 2
Task

Write a Java program to:

Create the graph using an Adjacency List
Store each edge using a custom Edge class
Display all connections in the graph in the format:
Source -> Destination (Weight)
Input Format
No user input required.

Output Format

Print all edges of the graph.

Example Output
0 -> 1 (5)
1 -> 0 (5)
1 -> 2 (1)
1 -> 3 (3)

2 -> 1 (1)
2 -> 3 (1)
2 -> 4 (2)

3 -> 1 (3)
3 -> 2 (1)

4 -> 2 (2)
Constraints
Number of vertices = 5
Graph is undirected
Use ArrayList<Edge>[] for representation
*/
import java.util.ArrayList;

public class graph_day5 {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> 1,2
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        for (int i = 0; i < graph.length; i++) {
            System.out.println("Vertex " + i + ":");
            for (int j = 0; j < graph[i].size(); j++) {

                Edge e = graph[i].get(j);

                System.out.println(
                        e.src + " -> " + e.dest + " (" + e.wt + ")"
                );
            }

            System.out.println();
        }
    }
}