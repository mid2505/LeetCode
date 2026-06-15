class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = 1<<nums.length;
        int[] sums = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int t = 0;
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) != 0) t|=nums[j];
            }
            max = Math.max(max,t);
            sums[i]=t;
        }
        int count = 0;
        for(int i : sums) if(i==max) count++;
        return count;
    }
}