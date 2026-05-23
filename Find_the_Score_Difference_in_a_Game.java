// Problem: Find the Score Difference in a Game
// Language: java

class Solution {
    public int scoreDifference(int[] nums) {
        int[] players = new int[2];
        int active = 0;

        for(int i=0;i<nums.length;i++){
            if((nums[i]%2!=0 && i%6!=5) || (nums[i]%2==0 && i%6==5)){
                active = (active==0)?1:0;
                players[active] += nums[i];
            }
            else players[active] += nums[i];
        }
        return players[0]-players[1];
    }
}