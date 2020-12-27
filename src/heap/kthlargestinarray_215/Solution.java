package heap.kthlargestinarray_215;

import java.util.PriorityQueue;

public class Solution {
    public int badFindKthLargest(int[] nums, int k) {
        int result = -1;
        for(int i = 0; i < k; i++){
            int index = 0;
            for(int j = 0; j < nums.length; j++){
                if(j > index && nums[j] > nums[index]){
                    index = j;
                }
            }
            if(index < nums.length)
                result = nums[index];
        }
        return result;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int x : nums){
            queue.offer(x);
            if(queue.size() > k) queue.poll();

        }
        return queue.peek();
    }
}