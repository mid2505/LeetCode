// Problem: Sum of Elements With Frequency Divisible by K
// Language: java

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans=0;
        int count=0;
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int[] t = s.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<t.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(t[i]==nums[j]){
                    temp++;
                }
            }
            if(temp%k==0){
                ans+=(temp*t[i]);
            }
        }
        return ans;
    }
}