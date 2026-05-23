// Problem: Running Sum of 1d Array
// Language: java

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nsums(nums,i+1);
        }
        return ans;
    }
    public int nsums(int[] nums, int x){
        int ans=0;
        for(int i=0;i<x;i++){
            ans+=nums[i];
        }
        return ans;
    }
}