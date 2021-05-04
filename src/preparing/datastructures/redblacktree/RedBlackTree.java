package preparing.datastructures.redblacktree;

import static preparing.datastructures.redblacktree.RedBlackNode.BLACK;
import static preparing.datastructures.redblacktree.RedBlackNode.RED;

public class RedBlackTree {
    public RedBlackNode root;

    private boolean isRed(RedBlackNode x){
        if(x == null) return false;
        return x.color == RED;
    }

    private RedBlackNode rotateLeft(RedBlackNode h){
        RedBlackNode x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private RedBlackNode rotateRight(RedBlackNode h){
        RedBlackNode x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(RedBlackNode h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

}
