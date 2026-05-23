// Problem: Final Prices With a Special Discount in a Shop
// Language: java

class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[] = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            boolean flag = true;
            for(int j=0;j<prices.length;j++){
                if(j>i && prices[j]<=prices[i]){
                    ans[i] = prices[i]-prices[j];
                    flag = false;
                    break;
                }
            }
            if(flag) ans[i] = prices[i];
        }
        return ans;
    }
}