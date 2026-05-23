// Problem: Power of Four
// Language: java

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0) return false;
        n = Math.abs(n);
        int l = Integer.toBinaryString(n).length();
        int l1 = Integer.bitCount(n);
        if(l1==1 && (l1-l)%2==0) return true;
        return false;
    }
}