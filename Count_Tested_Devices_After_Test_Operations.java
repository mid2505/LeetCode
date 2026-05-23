// Problem: Count Tested Devices After Test Operations
// Language: java

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count=0;
        for(int i=0;i<batteryPercentages.length;i++){
            if(batteryPercentages[i] > 0){
                count++;
                batteryPercentages = minus(batteryPercentages);
            }
        }
        return count;
    }
    public int[] minus(int[] b){
        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
                b[i]--;
            }
        }
        return b;
    }
}