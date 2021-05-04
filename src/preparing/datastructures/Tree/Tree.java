package preparing.datastructures.Tree;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private boolean balancing = false;
    protected Node root;
    protected int size = 0;
    public Tree(){}

    public Tree(boolean balance){
        this.balancing = balance;
    }
    public void add(int value){
        root = add(root, value);
        size++;
    }

    protected Node add(Node r, int val){
        if(r == null){
            return new Node(val);
        }

        if(r.val > val){
            r.left = add(r.left, val);
        } else {
            r.right = add(r.right, val);
        }

        if(this.balancing){
            if(isRed(r.right) && !isRed(r.left))
                r = rotateLeft(r);
            if(isRed(r.left) && isRed(r.left.left))
                r = rotateRight(r);
            if(isRed(r.left) && isRed(r.right))
                flipColors(r);
        }

        r.count = 1 + count(r.left) + count(r.right);
        return r;
    }

    private Node rotateLeft(Node n){
        Node x = n.right;
        n.right = x.left;
        x.left = n;
        x.color = n.color;
        n.color = Node.RED;
        n.count = 1 + count(n.left) + count(n.right);
        x.count = 1 + count(x.left) + count(x.right);
        return x;
    }

    private Node rotateRight(Node n){
        Node x = n.left;
        n.left  = x.right;
        x.right = n;
        x.color = n.color;
        n.color = Node.RED;
        n.count = 1 + count(n.left) + count(n.right);
        x.count = 1 + count(x.left) + count(x.right);
        return x;
    }

    private void flipColors(Node n ){
        n.color = Node.RED;
        n.left.color = Node.BLACK;
        n.right.color = Node.BLACK;
    }

    private boolean isRed(Node n){
        if(n == null) return false;
        return n.color == Node.RED;
    }

    public void remove(int val){
        root = remove(root, val);
    }

    protected Node remove(Node n, int val){
        if(n == null){
            return null;
        }
        if(n.val > val){
            n.left = remove(n.left, val);
        } else if(n.val < val){
            n.right = remove(n.right, val);
        } else {
            if(n.right == null){
                return n.left;
            }

            if(n.left == null){
                return n.right;
            }

            Node old = n;
            n = min(old.right);
            n.right = removeMin(old.right);
            n.left = old.left;
        }
        n.count = 1 + count(n.left) + count(n.right);
        return n;
    }

    public void removeMin(){
        root = removeMin(root);
    }

    protected Node removeMin(Node n){
        if(n == null){
            return n;
        }
        if(n.left == null){
            return n.right;
        }


        n.left = removeMin(n.left);
        n.count = 1 + count(n.left) + count(n.right);
        return n;
    }

    public Node min(){
        return min(root);
    }

    protected Node min(Node n){
        if(n == null){
            return null;
        }
        if(n.left == null)
            return n;

        return min(n.left);
    }

    public void showTree(){
        try{
            OutputStreamWriter out = new OutputStreamWriter(System.out);
            printTree(root, out);
            BufferedWriter log = new BufferedWriter(out);
            log.flush();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void printTree(Node n, OutputStreamWriter out) throws IOException {
        if (n.right != null) {
            printTree(n.right, out, true, "");
        }
        printNodeValue(n, out);
        if (n.left != null) {
            printTree(n.left, out, false, "");
        }
    }

    protected void printNodeValue(Node n, OutputStreamWriter out) throws IOException {
        if (n == null) {
            out.write("<null>");
        } else {
            out.write(Integer.toString(n.val));
        }
        out.write('\n');
    }
    // use string and not stringbuffer on purpose as we need to change the indent at each recursion
    protected void printTree(Node r, OutputStreamWriter out, boolean isRight, String indent) throws IOException {
        if (r.right != null) {
            printTree(r.right, out, true, indent + (isRight ? "        " : " |      "));
        }
        out.write(indent);
        if (isRight) {
            out.write(" /");
        } else {
            out.write(" \\");
        }
        if(r.color == Node.RED){
            out.write("----- ");
        } else {
            out.write("===== ");
        }
        printNodeValue(r, out);
        if (r.left != null) {
            printTree(r.left, out, false, indent + (isRight ? " |      " : "        "));
        }
    }

    public int size() {
        return count(root);
    }

    protected int count(Node n){
        if(n == null)
            return 0;

        return n.count;
    }
}
