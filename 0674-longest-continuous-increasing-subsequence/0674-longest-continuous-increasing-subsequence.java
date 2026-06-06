class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                if(max<count) max = count;
            }
            else count = 0;
        }
        return max+1;
    }
}