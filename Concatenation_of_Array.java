// Problem: Concatenation of Array
// Language: java

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int x = nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[x++] = nums[i];
        }
        return ans;
    }
}