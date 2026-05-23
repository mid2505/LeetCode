class Solution {
    public boolean check(int[] nums) {
        int min = nums[0];
        int minIdx = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(min>=nums[i] && nums[i]!=nums[i-1]){
                min = nums[i];
                minIdx = i;
            }
        }
        for(int i=0;i<n-1;i++){
            if(nums[minIdx%n]>nums[(minIdx+1)%n]) return false;
            minIdx++;
        }
        return true;
    }
}