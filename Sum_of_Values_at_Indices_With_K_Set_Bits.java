// Problem: Sum of Values at Indices With K Set Bits
// Language: java

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(apt(i,k)){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
    public boolean apt(int val, int k){
        int ans = 0;
        while(val>0){
            if(val%2==1){
                ans++;
                val/=2;
            }
            else{
                val/=2;
            }
        }
        if(ans==k) return true;
        else return false;
    }
}