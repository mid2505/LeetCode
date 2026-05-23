// Problem: Minimum Operations to Make Binary Array Elements Equal to One I
// Language: java

class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]!=1){
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
                count++;
            }
        }
        for(int i:nums){
            if(i==0) return -1;
        }
        return count;
    }
}