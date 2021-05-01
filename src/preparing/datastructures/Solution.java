package preparing.datastructures;

import preparing.datastructures.Tree.Tree;
import preparing.datastructures.hashtable.HashMap;

public class Solution {
    public static void main(String [] args){
        Tree tree = new Tree();
        tree.add(4);
        tree.add(2);
        tree.add(3);
        tree.add(1);
        tree.add(6);
        tree.add(5);
        tree.showTree();
        tree.remove(2);
        tree.showTree();
        tree.remove(4);
        tree.showTree();
        System.out.println("size = " + tree.size());
        System.out.println(tree.min().val);
    }
}
