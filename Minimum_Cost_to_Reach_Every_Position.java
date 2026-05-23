// Problem: Minimum Cost to Reach Every Position
// Language: java

class Solution {
    public int[] minCosts(int[] cost) {
        int rc = cost[0];
        for(int i=1;i<cost.length;i++){
            if(cost[i]<rc) rc = cost[i];
            else cost[i] = rc;
        }
        return cost;
    }
}