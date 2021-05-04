package preparing.datastructures.redblacktree;

import preparing.datastructures.Tree.Node;

public class RedBlackNode extends Node {


    public boolean color;
    public int val;
    public RedBlackNode left;
    public RedBlackNode right;
    public int count;

    public RedBlackNode() {
    }

    public RedBlackNode(int val) {
        this.val = val;
        this.count = 1;
    }

    public RedBlackNode(int val, RedBlackNode left, RedBlackNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.count = 0;
    }
}
