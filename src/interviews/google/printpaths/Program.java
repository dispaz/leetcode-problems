package interviews.google.printpaths;

public class Program {
    public static void main(String [] args){
        String[] paths = new String[] {
                "app/test/publc", "app/test/private", "app/src", "example/first", "example"
        };
        Solution solution = new Solution();
        for(String path : paths){
            solution.insert(path);
        }

        solution.printPaths();
    }
}
