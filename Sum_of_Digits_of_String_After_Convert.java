// Problem: Sum of Digits of String After Convert
// Language: java

class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        for(char ch : s.toCharArray()){
            int p = ((int)ch)-96;
            while (p > 0) {
                ans += p % 10;
                p /= 10;
            }
        }
        for(int i=1;i<k;i++){
            ans = fn1(ans);
        }
        return ans;
    }
    public int fn1(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}