class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroCount = 0;
        int ans = 0;
        for(int i:nums) if(i==0) zeroCount++;
        for(int i=nums.length-zeroCount;i<nums.length;i++){
            if(nums[i]!=0) ans++;
        }
        return ans;
    }
}