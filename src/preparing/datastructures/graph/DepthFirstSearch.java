package preparing.datastructures.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {
    private int [] edgeTo;
    private boolean [] visited;
    private Graph graph;
    private int s;

    public DepthFirstSearch(Graph g, int v){
        graph = g;
        edgeTo = new int[g.verticesSize];
        visited = new boolean[g.verticesSize];
        s = v;
        dfs(s);
    }

    public boolean hasPathTo(int v){
        return visited[v];
    }

    private void dfs(int v){
        System.out.print(v + " ");
        visited[v] = true;
        for(int w : graph.adj(v)){
            if(!visited[w]){
                edgeTo[w] = v;
                dfs(w);
            }
        }
    }

    public Iterable<Integer> pathTo(int v){
        Stack<Integer> result = new Stack();
        if(!hasPathTo(v)){
            return result;
        }

        for(int w = v; w != s; w = edgeTo[w]){
            result.push(w);
        }

        result.push(s);
        return result;
    }
}
