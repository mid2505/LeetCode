// Problem: Count Equal and Divisible Pairs in an Array
// Language: java

class Solution {
    public int countPairs(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] == nums[j])){
                    if((i*j)%k==0) ans++;
                }
            }
        }
        return ans;
    }
}