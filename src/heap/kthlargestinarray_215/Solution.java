package heap.kthlargestinarray_215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
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
}