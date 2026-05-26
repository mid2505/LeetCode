class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>nums[i]) min = nums[i];
            if(max1<nums[i]){
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2<nums[i]) max2 = nums[i];
        }
        return max1+max2-min;
    }
}