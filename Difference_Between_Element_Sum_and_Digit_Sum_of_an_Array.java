// Problem: Difference Between Element Sum and Digit Sum of an Array
// Language: java

class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;
        int elesum = 0;
        int digsm = 0;
        for(int i=0;i<nums.length;i++){
            elesum+=nums[i];
            digsm+=digsum(nums[i]);
        }
        return Math.abs(elesum-digsm);
        
    }
    public int digsum(int n){
        int ans=0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
}