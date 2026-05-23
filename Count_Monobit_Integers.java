// Problem: Count Monobit Integers
// Language: java

class Solution {
    public int countMonobit(int n) {
        int ans = 0;
        for(int i=0;i<=n;i++){
            if(i==0 || (i&(i+1))==0) ans+=1;
            else ans+=0;
        }
        return ans;
    }
}