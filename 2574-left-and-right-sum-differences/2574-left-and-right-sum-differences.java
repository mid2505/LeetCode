class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] lsmr = new int[nums.length];
        int[] rsmr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            lsmr[i] = lsm(nums,i);
            rsmr[i] = rsm(nums,i);
            ans[i] = (lsmr[i]>rsmr[i])?(lsmr[i]-rsmr[i]):(rsmr[i]-lsmr[i]);
        }
        return ans;
    }
    public int lsm(int[] nums, int x){
        int lsm=0;
        for(int i=0;i<x;i++){
            lsm+=nums[i];
        }
        return lsm;
    }
    public int rsm(int[] nums, int x){
        int rsm=0;
        for(int i=nums.length-1;i>x;i--){
            rsm+=nums[i];
        }
        return rsm;
    }
}