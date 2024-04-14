package Armaan;

import java.util.*;

public class PrimAlgorithm {

    public static class Graph {
        private int vertices;
        private List<List<Edge>> adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).add(new Edge(destination, weight));
            adjacencyList.get(destination).add(new Edge(source, weight));
        }

        public int primMST() {
            boolean[] visited = new boolean[vertices];
            int[] parent = new int[vertices];
            int[] key = new int[vertices];

            Arrays.fill(key, Integer.MAX_VALUE);
            key[0] = 0;
            parent[0] = -1;
            int totalCost = 0;

            PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.key));
            priorityQueue.add(new Node(0, key[0]));

            while (!priorityQueue.isEmpty()) {
                int u = priorityQueue.poll().vertex;
                visited[u] = true;

                for (Edge edge : adjacencyList.get(u)) {
                    int v = edge.destination;
                    int weight = edge.weight;

                    if (!visited[v] && weight < key[v]) {
                        key[v] = weight;
                        priorityQueue.add(new Node(v, key[v]));
                        parent[v] = u;
                    }
                }
            }

            totalCost = calculateTotalCost(parent);
            printMST(parent);
            return totalCost;
        }

        private void printMST(int[] parent) {
            System.out.println("Edge \tWeight");
            for (int i = 1; i < vertices; i++) {
                System.out.println(parent[i] + " - " + i + "\t" + adjacencyList.get(i).get(parent[i]).weight);
            }
        }

        private int calculateTotalCost(int[] parent) {
            int totalCost = 0;
            for (int i = 1; i < vertices; i++) {
                totalCost += adjacencyList.get(i).get(parent[i]).weight;
            }
            return totalCost;
        }
    }

    public static class Edge {
        private int destination;
        private int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static class Node {
        private int vertex;
        private int key;

        public Node(int vertex, int key) {
            this.vertex = vertex;
            this.key = key;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        int totalCost = graph.primMST();
        System.out.println("Total Cost of MST: " + totalCost);
        System.out.println("Armaan 22CSU027");
    }
}
