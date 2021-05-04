package preparing.datastructures;

import preparing.datastructures.Tree.Tree;
import preparing.datastructures.hashtable.HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

    public static final int TREE_SIZE = 25;

    public static void main(String [] args){
        Tree tree = new Tree(true);
        List<Integer> arr = new ArrayList();
        for(int i = 0; i < TREE_SIZE; i++){
            arr.add(i + 1);
        }
        Random rand = new Random();
        for(int i = 0; i < TREE_SIZE; i++){
            int id = rand.nextInt(arr.size());
            System.out.print("\n\n\n\n" + "adding " + arr.get(id) + "\n\n\n\n");
            tree.add(arr.get(id));
            arr.remove(id);
            tree.showTree();
        }
        System.out.println("size = " + tree.size());

        System.out.println(tree.min().val);
    }
}
