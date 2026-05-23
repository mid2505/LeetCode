// Problem: Jewels and Stones
// Language: java

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        StringBuilder j = new StringBuilder(jewels);
        int ans = 0;
        for(int i = 0; i<stones.length();i++){
            if(j.indexOf(stones.charAt(i)+"")!=-1){
                ans++;
            }
        }
        return ans;
    }
}