package preparing.datastructures.Tree;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private Node root;
    private int size = 0;
    public void add(int value){
        root = add(root, value);
        size++;
    }

    private Node add(Node r, int val){
        if(r == null){
            return new Node(val);
        }

        if(r.val > val){
            r.left = add(r.left, val);
        } else {
            r.right = add(r.right, val);
        }

        r.count = 1 + count(r.left) + count(r.right);
        return r;
    }

    public void remove(int val){
        root = remove(root, val);
    }

    private Node remove(Node n, int val){
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

    private Node removeMin(Node n){
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

    private Node min(Node n){
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

    private void printTree(Node n, OutputStreamWriter out) throws IOException {
        if (n.right != null) {
            printTree(n.right, out, true, "");
        }
        printNodeValue(n, out);
        if (n.left != null) {
            printTree(n.left, out, false, "");
        }
    }

    private void printNodeValue(Node n, OutputStreamWriter out) throws IOException {
        if (n == null) {
            out.write("<null>");
        } else {
            out.write(Integer.toString(n.val));
        }
        out.write('\n');
    }
    // use string and not stringbuffer on purpose as we need to change the indent at each recursion
    private void printTree(Node r, OutputStreamWriter out, boolean isRight, String indent) throws IOException {
        if (r.right != null) {
            printTree(r.right, out, true, indent + (isRight ? "        " : " |      "));
        }
        out.write(indent);
        if (isRight) {
            out.write(" /");
        } else {
            out.write(" \\");
        }
        out.write("----- ");
        printNodeValue(r, out);
        if (r.left != null) {
            printTree(r.left, out, false, indent + (isRight ? " |      " : "        "));
        }
    }

    public int size() {
        return count(root);
    }

    private int count(Node n){
        if(n == null)
            return 0;

        return n.count;
    }
}
