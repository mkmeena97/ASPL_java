package DataStructure.Graph;

import java.util.*;

class Edge {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
}

public class KruskalDemo {

    int find(int[] parent, int i) {
        if (parent[i] != i)
            parent[i] = find(parent, parent[i]);
        return parent[i];
    }

    void union(int[] parent, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);
        parent[yRoot] = xRoot;
    }

    void kruskal(List<Edge> edges, int V) {
        Collections.sort(edges, Comparator.comparingInt(e -> e.weight));
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        List<Edge> mst = new ArrayList<>();

        for (Edge e : edges) {
            int x = find(parent, e.src);
            int y = find(parent, e.dest);
            if (x != y) {
                mst.add(e);
                union(parent, x, y);
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (Edge e : mst)
            System.out.println(e.src + " - " + e.dest + " : " + e.weight);
    }

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();

        // Add edges: (source, destination, weight)
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        int V = 4; // Number of vertices

        KruskalDemo graph = new KruskalDemo();
        graph.kruskal(edges, V);
    }
}
