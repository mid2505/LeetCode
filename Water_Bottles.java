// Problem: Water Bottles
// Language: java

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        while(numBottles>=numExchange){
            int temp = numBottles/numExchange;
            drank+=temp;
            int r = numBottles%numExchange;
            numBottles = temp + r;
        }
        return drank;
    }
}