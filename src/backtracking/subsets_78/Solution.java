package backtracking.subsets_78;

public class Solution {
    int k;
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        for(k = 0; k <= nums.length; k++){
            backtrack(list, new ArrayList(), 0, nums);
        }
        return list;
    }

    void backtrack(List<List<Integer>> list, List<Integer> tmp, int index, int [] nums){
        if(tmp.size() == k){
            list.add(new ArrayList(tmp));
            return;
        }

        for(int i = index; i < nums.length; i++){
            tmp.add(nums[i]);
            backtrack(list, tmp, i + 1, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}