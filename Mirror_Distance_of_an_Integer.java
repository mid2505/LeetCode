// Problem: Mirror Distance of an Integer
// Language: java

class Solution {
    public int mirrorDistance(int n) {
        int r = 0;
        int n1 = n;
        while(n!=0){
            int temp = n%10;
            r = r*10 + temp;;
            n/=10;
        }
        return Math.abs(n1-r);
    }
}