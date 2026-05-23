// Problem: Minimum Capacity Box
// Language: java

class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = 101;
        int minIdx = -1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && min>capacity[i]){
                min = capacity[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
}