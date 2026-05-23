// Problem: Minimum Cost to Split into Ones
// Language: java

class Solution {
    int cost = 0;
    public int minCost(int n) {
        if(n==1) return 0;
        rec(n/2,n-n/2);
        return cost;
    }
    public void rec(int x,int y){
        cost+=x*y;
        if (x!=1) rec(x/2,x-(x/2));
        if (y!=1) rec(y/2,y-(y/2));
        return;
    }
}