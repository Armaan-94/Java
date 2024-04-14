package Armaan;

import java.util.*;

public class KruskalAlgorithm {

    public static class Graph {
        private int vertices;
        private List<Edge> edges;

        public Graph(int vertices) {
            this.vertices = vertices;
            edges = new ArrayList<>();
        }

        public void addEdge(int source, int destination, int weight) {
            edges.add(new Edge(source, destination, weight));
        }

        public int kruskalMST() {
            int totalCost = 0;
            
            Collections.sort(edges);

            DisjointSet disjointSet = new DisjointSet(vertices);

            for (Edge edge : edges) {
                int root1 = disjointSet.find(edge.source);
                int root2 = disjointSet.find(edge.destination);

                if (root1 != root2) {
                    disjointSet.union(root1, root2);
                    totalCost += edge.weight;
                }
            }
            return totalCost;
        }
    }

    public static class Edge implements Comparable<Edge> {
        private int source;
        private int destination;
        private int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    public static class DisjointSet {
        private int[] parent;

        public DisjointSet(int vertices) {
            parent = new int[vertices];
            for (int i = 0; i < vertices; i++) {
                parent[i] = i;
            }
        }

        public int find(int vertex) {
            if (parent[vertex] != vertex) {
                parent[vertex] = find(parent[vertex]);
            }
            return parent[vertex];
        }

        public void union(int root1, int root2) {
            parent[root2] = root1;
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

        int totalCost = graph.kruskalMST();
        System.out.println("Total Cost of MST: " + totalCost);
        System.out.println("Armaan 22CSU027");
    }
}
