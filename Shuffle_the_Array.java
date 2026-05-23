// Problem: Shuffle the Array
// Language: java

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0;
        int x = 0;
        while(i<nums.length/2){
            ans[x++] = nums[i];
            ans[x++] = nums[i+n];
            i++;
        }
        return ans;
    }
}