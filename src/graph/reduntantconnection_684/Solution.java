package graph.reduntantconnection_684;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> set = new HashSet<>();

    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[1001];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        int [] result = new int[0];
        for(int [] edge : edges){
            set.clear();

            if(dfs(graph, edge[0], edge[1])){
                result = edge;
            }
            else{
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }
        }
        return result;
    }

    private boolean dfs(ArrayList<Integer> [] graph, int u, int v){
        if(!set.contains(u)){
            set.add(u);
            if(u == v) return true;
            for(int index : graph[u]){
                if(dfs(graph, index, v)){
                    return true;
                }
            }
        }
        return false;
    }
}
