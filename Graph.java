import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false);  // Undirected graph with 5 vertices

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);

        // Print adjacency list
        System.out.println("Graph structure:");
        graph.printGraph();

        // DFS traversal starting from node 0
        System.out.println("\nDFS from node 0:");
        graph.dfs(0, new boolean[5]);

        // BFS traversal starting from node 0
        System.out.println("\n\nBFS from node 0:");
        graph.bfs(0);
    }
}

class Graph {
    private final ArrayList<HashSet<Integer>> adjacencyList;
    private final int vertices;
    private final boolean isDirected;

    // Constructor
    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new HashSet<>());
        }
    }

    // Add edge from src to dest (and dest to src if undirected)
    public void addEdge(int src, int dest) {
        if (isValidVertex(src) && isValidVertex(dest)) {
            adjacencyList.get(src).add(dest);
            if (!isDirected) {
                adjacencyList.get(dest).add(src);
            }
        } else {
            System.out.println("Invalid source or destination. Available vertices are:");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Remove edge from src to dest (and dest to src if undirected)
    public void removeEdge(int src, int dest) {
        if (isValidVertex(src) && isValidVertex(dest)) {
            adjacencyList.get(src).remove(dest);
            if (!isDirected) {
                adjacencyList.get(dest).remove(src);
            }
        } else {
            System.out.println("Invalid source or destination.");
        }
    }

    // Check if edge exists from src to dest
    public boolean isHavingEdge(int src, int dest) {
        return adjacencyList.get(src).contains(dest);
    }

    // Get neighbors of a vertex
    public HashSet<Integer> getNeighbours(int src) {
        if (!isValidVertex(src)) {
            throw new IndexOutOfBoundsException("Invalid vertex index: " + src);
        }
        return adjacencyList.get(src);
    }

    // Print adjacency list of the graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Depth-First Search traversal starting at node
    public void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    // Breadth-First Search traversal starting at start node
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjacencyList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Validate vertex index
    private boolean isValidVertex(int v) {
        return v >= 0 && v < vertices;
    }
}
