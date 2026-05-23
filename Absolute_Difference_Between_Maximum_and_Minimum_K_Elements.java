// Problem: Absolute Difference Between Maximum and Minimum K Elements
// Language: java

class Solution {
    public int absDifference(int[] nums, int k) {
        int sum1=0; 
        int sum2=0;
        int n=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            sum1+=nums[i];
            sum2+=nums[n];
            n--;
        }
        return Math.abs(sum1-sum2);
    }
}