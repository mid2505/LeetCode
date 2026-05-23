// Problem: Sum of Variable Length Subarrays
// Language: java

class Solution {
    public int subarraySum(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int t = (i-nums[i]>0)?i-nums[i]:0;
            ans+=fs(nums,t,i);
        }
        return ans;
    }
    public int fs(int[] nums, int st, int x){
        int ans=0;
        for(int i=st;i<=x;i++){
            ans+=nums[i];
        }
        return ans;
    }
}