package preparing.datastructures.graph;

import java.util.ArrayList;

public class Graph {
    public final int verticesSize;
    private ArrayList<Integer>[] adj;


    public Graph(int v){
        verticesSize = v;
        adj = new ArrayList[verticesSize];
        for(int i = 0; i < verticesSize; i++){
            adj[i] = new ArrayList();
        }
    }

    public void addEdge(int v, int w){
        adj[w].add(v);
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}

