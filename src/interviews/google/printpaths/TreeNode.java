package interviews.google.printpaths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class TreeNode {
    public String path;
    public HashMap<String, TreeNode> map;

    public TreeNode(String path){
        this.path = path;
        map = new HashMap<>();
    }

    public void insert(String [] paths){
        if(paths.length == 0)
            return;

        if(!map.containsKey(paths[0])){
            map.put(paths[0], new TreeNode(paths[0]));
        }
        String[] newPaths = Arrays.copyOfRange(paths, 1, paths.length);
        TreeNode node = map.get(paths[0]);
        node.insert(newPaths);
    }

    public void print(Set<String> keys, int count){
        for(String key: keys){
            for(int i = 0; i < count; i++){
                System.out.print("\t");
            }
            TreeNode n = map.get(key);
            System.out.println("-- " + n.path);
            n.print(n.map.keySet(), count + 1);
        }
    }
}
