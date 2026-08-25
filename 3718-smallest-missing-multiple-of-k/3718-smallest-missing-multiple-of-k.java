class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums) s.add(i);
        for(int i=k;i<99999;i+=k){
            if(!s.contains(i)) return i;
        }
        return -1;
    }
}