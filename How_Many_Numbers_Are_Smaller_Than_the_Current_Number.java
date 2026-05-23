// Problem: How Many Numbers Are Smaller Than the Current Number
// Language: java

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]) ans[i]++;
            }
        }
        return ans;
    }
}