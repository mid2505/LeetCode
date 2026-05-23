// Problem: Best Time to Buy and Sell Stock
// Language: java

class Solution {
    public int maxProfit(int[] prices) {
        int[] minSoFar = new int[prices.length];
        int[] maxSoFar = new int[prices.length];
        int i=0;
        int j=prices.length-1;
        int min = prices[i];
        int max = prices[j];
        minSoFar[i] = min;
        maxSoFar[j] = max;
        while(i<prices.length){
            if(prices[i]<min) min = prices[i];
            if(prices[j]>max) max = prices[j];
            minSoFar[i] = min;
            maxSoFar[j] = max;
            i++;
            j--;
        }
        int cMax=Integer.MIN_VALUE;
        // for(int m: minSoFar) System.out.print(m+" ");
        // System.out.println();
        // for(int m: maxSoFar) System.out.print(m+" ");
        for(i=0;i<prices.length;i++){
            if(cMax<(maxSoFar[i]-minSoFar[i])) cMax = (maxSoFar[i]-minSoFar[i]);
        }
        return cMax;
   }
}