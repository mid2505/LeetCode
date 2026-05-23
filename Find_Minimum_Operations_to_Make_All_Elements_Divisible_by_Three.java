// Problem: Find Minimum Operations to Make All Elements Divisible by Three
// Language: java

class Solution {
    public int minimumOperations(int[] nums) {
        int opcount = 0;
        for(int i : nums){
            if(i%3==0){
                continue;
            }
            else{
                opcount++;
            }
        }
        return opcount;
    }
}