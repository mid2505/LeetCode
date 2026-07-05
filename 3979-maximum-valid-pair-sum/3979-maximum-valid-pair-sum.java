class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int i = 0;
        int j = i+k;
        int n = nums.length;
        int max = nums[n-1];
        int finMax = Integer.MIN_VALUE;
        int[] maxSoFar = new int[nums.length];
        for(int x=n-1;x>=0;x--){
            max = Math.max(max,nums[x]);
            maxSoFar[x] = max;
        }
        while(i<(n-k)){
            j=i+k;
            finMax = Math.max(finMax,(nums[i]+maxSoFar[j]));
            i++;
        }
        return finMax;
    }
}