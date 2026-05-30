class Solution {
    public int pivotIndex(int[] nums){
        int n = nums.length;
        int[] prefix = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        for(int i=0;i<prefix.length-1;i++){
            if(prefix[i]==prefix[prefix.length-1]-prefix[i+1]){
                return i;
            }
        }

        return -1;
    }
}