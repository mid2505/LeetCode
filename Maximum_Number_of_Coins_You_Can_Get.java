// Problem: Maximum Number of Coins You Can Get
// Language: java

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0;
        int j = piles.length-1;
        int ans = 0;
        int a;
        int b;
        int n = 0;
        while(n<piles.length/3){
            a=piles[j];
            b=piles[i];
            ans+=piles[j-1];
            i++;
            j-=2;
            n++;
        }
        return ans;
    }
}