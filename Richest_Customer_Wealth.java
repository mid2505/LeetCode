// Problem: Richest Customer Wealth
// Language: java

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int tempmax = 0;
            for(int j=0;j<accounts[i].length;j++){
                tempmax+=accounts[i][j];
            }
            if(tempmax>max) max = tempmax;
        }
        return max;
    }
}