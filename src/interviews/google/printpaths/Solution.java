package interviews.google.printpaths;


//For array of strings
// ex. ["app/test/public", "app/test/private", "app/src", "example/first"]
// print all paths
//  -- app
//    -- test
//        -- public
//        -- private
//    -- src
//  -- example
//    -- first

public class Solution {


    TreeNode root = new TreeNode("");
    public void printPaths(){
        root.print(root.map.keySet(), 0);
    }

    public void insert(String path){
        String [] paths = path.split("/");
        root.insert(paths);
    }
}
