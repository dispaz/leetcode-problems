package preparing.datastructures;

import preparing.datastructures.Tree.Tree;
import preparing.datastructures.graph.BreadthFirstSearch;
import preparing.datastructures.graph.DepthFirstSearch;
import preparing.datastructures.graph.Graph;
import preparing.datastructures.hashtable.HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

    public static final int TREE_SIZE = 25;

    public static void main(String [] args){

        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(4,3);
        graph.addEdge(5,8);
        graph.addEdge(6,8);
        graph.addEdge(0,7);
        graph.addEdge(3,7);
        graph.addEdge(2,9);
        graph.addEdge(6,7);

        DepthFirstSearch dfs = new DepthFirstSearch(graph, 0);
        System.out.println();
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
        System.out.println();
        for(int x : dfs.pathTo(9)){
            System.out.print(x + " ");
        }
    }
}
