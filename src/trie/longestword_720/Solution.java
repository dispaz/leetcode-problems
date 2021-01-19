package trie.longestword_720;

public class Solution {
    public String longestWord(String[] words) {
        Node root = new Node();
        root.word = "-";
        for(String word : words){
            root.insert(word);
        }
        return findWord(root, "");
    }

    private String findWord(Node root, String str){
        if(root == null || root.word.length() == 0){
            return str;
        }
        String res = "";
        if(!root.word.equals("-")){
            str = root.word;
        }
        for(Node n : root.children){
            String curr = findWord(n, str);
            if(curr.length() > res.length() ||
                    (curr.length() == res.length() && curr.compareTo(res) < 0)){
                res = curr;
            }
        }

        return res;
    }
}

class Node{
    public Node[] children = new Node[26];
    public String word = "";
    public void insert(String w){
        Node n = this;
        for(int i = 0; i < w.length(); i++){
            if(n.children[w.charAt(i) - 'a'] == null){
                n.children[w.charAt(i) - 'a'] = new Node();
            }
            n = n.children[w.charAt(i) - 'a'];
        }
        n.word = w;
    }
}