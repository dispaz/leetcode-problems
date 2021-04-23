package problems.graph.courseschedule_207;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [][] matrix = new int[numCourses][numCourses];
        int [] degree = new int[numCourses];
        for(int[] arr : prerequisites){
            if(matrix[arr[1]][arr[0]] == 0)
                degree[arr[0]]++;
            matrix[arr[1]][arr[0]] = 1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < degree.length; i++){
            if(degree[i] == 0)
                q.offer(i);
        }

        int count = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            for(int i = 0; i < numCourses; i++){
                if(matrix[i][curr] != 0){
                    if(--degree[i] == 0){
                        q.offer(i);
                    }
                }
            }
        }
        return count == numCourses;
    }
}
