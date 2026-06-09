class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(f1(nums.length-2,nums,dp1),f2(nums.length-1,nums,dp2));
    }
    public int f1(int idx,int[] nums,int[] dp){
        if(idx==0) return nums[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx]+f1(idx-2,nums,dp);
        int notPick = 0+f1(idx-1,nums,dp);
        return dp[idx]=Math.max(pick,notPick);
    }
    public int f2(int idx,int[] nums,int[] dp){
        if(idx==1) return nums[1];
        if(idx<1) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx]+f2(idx-2,nums,dp);
        int notPick = 0+f2(idx-1,nums,dp);
        return dp[idx]=Math.max(pick,notPick);
    }
}