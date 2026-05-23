// Problem: Count Dominant Indices
// Language: java

class Solution {
    public int dominantIndices(int[] nums) {
        int i = 0;
        int n = 0;
        int sum = 0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        i = 0;
        int avg;
        int l = nums.length;
        for(i=0;i<nums.length-1;i++){
            sum-=nums[i];
            avg = sum/(l-i-1);
            if(nums[i]>avg) n++;
        }
        return n;
    }
}