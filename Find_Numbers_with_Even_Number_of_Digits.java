// Problem: Find Numbers with Even Number of Digits
// Language: java

class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        boolean flag = true;
        for(int i : nums){
            flag = true;
            while(i>0){
                i/=10;
                flag = flag?false:true;
            }
            if(flag) c++;
        }
        return c;
    }
}