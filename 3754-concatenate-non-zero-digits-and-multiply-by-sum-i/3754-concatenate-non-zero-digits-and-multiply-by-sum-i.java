class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        while(n>0){
            long t = n%10;
            n/=10;
            if(t!=0){
                x=(x*10)+t;
                sum+=t;
            }
        }
        long rev=0;
        while(x>0){
            long t = x%10;
            rev = (rev*10)+t;
            x/=10;
        }
        return rev*sum;
    }
}