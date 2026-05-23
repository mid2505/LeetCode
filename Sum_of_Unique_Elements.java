// Problem: Sum of Unique Elements
// Language: java

class Solution {
    public int sumOfUnique(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    temp++;
                }
            }
            if(temp==0) ans+=nums[i];
        }
        return ans;
    }
}