package preparing.datastructures.Tree;

import problems.tree.TreeNode;

public class Node {
    public static final boolean BLACK = true;
    public static final boolean RED = false;

    public int val;
    public Node left;
    public Node right;
    public int count;
    public boolean color;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.count = 1;
        this.color = RED;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.count = 0;
    }
}
