// Problem: Plus One
// Language: java

class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        int count = 0;
        for(i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                count++;
                continue;
            }
            else{
                digits[i]++;
                for(int j=i+1;j<digits.length;j++){
                    digits[j]=0;
                }
                return digits;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}