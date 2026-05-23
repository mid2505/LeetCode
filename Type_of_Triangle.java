// Problem: Type of Triangle
// Language: java

class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1] <= nums[2] || nums[1]+nums[2] <= nums[0] || nums[2]+nums[0] <= nums[1]) return "none";
        if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2]) return "scalene";
        else if(nums[0]==nums[1] && nums[1]==nums[2] && nums[0]==nums[2]) return "equilateral";
        else return "isosceles";
    }
}