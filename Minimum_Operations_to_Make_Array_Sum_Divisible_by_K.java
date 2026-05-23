// Problem: Minimum Operations to Make Array Sum Divisible by K
// Language: java

class Solution {
    public int minOperations(int[] nums, int k) {
        int tot = 0;
        for(int i:nums){
            tot+=i;
        }
        int rem = tot%k;
        boolean flag = false;
        for(int i:nums){
            if(i>=rem){
                flag = true;
                break;
            }
        }
        int atot = 0;
        for(int i = 0; i < nums.length; i++){
            if(atot+nums[i] < rem) atot += nums[i];
            else atot+= rem-atot;
        }
        System.out.println(""+tot+" "+rem);
        if(flag) return rem;
        else return atot;
    }
}