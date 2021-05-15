package preparing.datastructures.graph;

import java.util.ArrayList;

public class Digraph {
    public final int verticesSize;
    private ArrayList<Integer>[] adj;


    public Digraph(int v){
        verticesSize = v;
        adj = new ArrayList[verticesSize];
        for(int i = 0; i < verticesSize; i++){
            adj[i] = new ArrayList();
        }
    }

    public void addEdge(int v, int w){
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}
