// Problem: Divide Array Into Equal Pairs
// Language: java

class Solution {
    public boolean divideArray(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    temp++;
                }
            }
            if(temp%2==0){
                ans++;
            }
        }
        return ((ans/2)==nums.length/2);
    }
}