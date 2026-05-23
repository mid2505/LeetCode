// Problem: Divide an Array Into Subarrays With Minimum Cost I
// Language: java

class Solution {
    public int minimumCost(int[] nums) {
        int min1 = nums[0];
        int min2,min3;
        nums[0] = 51;
        Arrays.sort(nums);
        return min1+nums[0]+nums[1];
    }
}