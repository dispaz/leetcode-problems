package preparing.datastructures.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private final int[] edgeTo;
    private final boolean[] marked;

    public BreadthFirstSearch(Graph g, int v) {
        edgeTo = new int[g.verticesSize];
        marked = new boolean[g.verticesSize];
        bfs(g, v);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int w : g.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = v;
                    q.add(w);
                }
            }
        }
    }
}
