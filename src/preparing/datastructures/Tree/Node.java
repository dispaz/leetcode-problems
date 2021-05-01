package preparing.datastructures.Tree;

import problems.tree.TreeNode;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public int count;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.count = 1;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.count = 0;
    }
}
