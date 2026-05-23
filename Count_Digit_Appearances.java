// Problem: Count Digit Appearances
// Language: java

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i:nums){
            while(i>0){
                if(i%10==digit) c++;
                i/=10;
            }
        }
        return c;
    }
}