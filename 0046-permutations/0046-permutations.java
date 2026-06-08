class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        f(0,nums);
        return l;
    }
    public void swap(int i, int j, int nums[]){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public void f(int idx, int[] nums){
        if(idx >= nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i : nums) temp.add(i);
            l.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(i, idx, nums);
            f(idx+1,nums);
            swap(i, idx, nums);
        }
    } 
}