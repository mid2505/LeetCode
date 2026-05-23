// Problem: Minimum Operations to Exceed Threshold Value I
// Language: java

class Solution {
    public int minOperations(int[] nums, int k) {
        int minop = 0;
        int i =0;
        while(i<nums.length){
            if(is_great(nums,k)){
                return minop;
            }
            else{
                nums[find_min_idx(nums)] = k;
                minop++;
                i++;
            }
        }  
        return minop;     
    }
    public boolean is_great(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                return false;
            }
        }
        return true;
    }
    public int find_min_idx(int[] nums){
        int min=Integer.MAX_VALUE;
        int min_idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
}