/*
Problem: Graph Traversal using DFS

You are given an undirected graph with 7 vertices numbered from 0 to 6.

The graph connections are:

0 → 1
0 → 2
1 → 3
2 → 4
3 → 5
4 → 5
5 → 6
Task

Write a Java program to perform Depth First Search (DFS) traversal starting from vertex 0.

Input Format

No user input required.

Output Format

Print the DFS traversal of the graph.

Example Output
DFS Traversal:
0 1 3 5 4 2 6
Graph Structure
        0
      /   \
     1     2
     |     |
     3     4
      \   /
        5
        |
        6
*/
    import java.util.*;
public class graph_day7{

    static int V = 7;
    static void createGraph(ArrayList<Integer>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(0);
        graph[1].add(3);

        graph[2].add(0);
        graph[2].add(4);
        graph[3].add(1);
        graph[3].add(5);

        graph[4].add(2);
        graph[4].add(5);
        graph[5].add(3);
        graph[5].add(4);
        graph[5].add(6);

        graph[6].add(5);
    }
    static void dfs(ArrayList<Integer>[] graph,
                    int curr,
                    boolean visited[]) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            int neighbor = graph[curr].get(i);

            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        System.out.println("DFS Traversal:");
        dfs(graph, 0, visited);
    }
}

