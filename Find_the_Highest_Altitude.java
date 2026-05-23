// Problem: Find the Highest Altitude
// Language: java

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int tot = 0;
        for(int i=0;i<gain.length;i++){
            tot+=gain[i];
            if(tot>max){
                max = tot;
            }
        }
        return max;
    }
}