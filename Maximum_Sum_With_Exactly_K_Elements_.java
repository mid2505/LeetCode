// Problem: Maximum Sum With Exactly K Elements 
// Language: java

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        k--;
        int t = (k*(k+1))/2;
        k++;
        return (max*k)+t;
    }
}