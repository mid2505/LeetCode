class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            s.add(nums[i]);
            if(!(s.size() == i+1)) return true;
        }
        return false;
    }
}