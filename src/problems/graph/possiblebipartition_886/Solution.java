package problems.graph.possiblebipartition_886;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap();
        for(int i = 0; i < n; i++){
            adj.put(i, new ArrayList());
        }

        for(int[] edge : dislikes){
            adj.get(edge[1] - 1).add(edge[0] - 1);
            adj.get(edge[0] - 1).add(edge[1] - 1);
        }

        int[] visited = new int[n];
        for(int i = 0; i < n; i++){
            if(visited[i] == 0 && !dfs(adj, i, visited, 1))
                return false;
        }

        return true;
    }

    private boolean dfs(HashMap<Integer, ArrayList<Integer>> adj, int i, int [] visited, int group){
        visited[i] = group;

        for(int j : adj.get(i)){
            if(visited[j] == group)
                return false;

            if(visited[j] == 0 && !dfs(adj, j, visited, -group))
                return false;
        }

        return true;
    }
}
