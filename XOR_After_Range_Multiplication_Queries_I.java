// Problem: XOR After Range Multiplication Queries I
// Language: java

class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int M = 1000000007;
        for(int i=0;i<queries.length;i++){
            int idx = queries[i][0];
            int limit = queries[i][1];
            int k = queries[i][2];
            int m = queries[i][3];
            while(idx<=limit){
                long temp = (long) nums[idx] * m;
                nums[idx] = (int)(temp % M);
                idx += k;
            }
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}