// Problem: Count Commas in Range II
// Language: java

class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        if(n==1000000000000000L) return (n-1000)+1+(n-1000000)+1+(n-1000000000)+1+(n-1000000000000L)+2;
        else if(n<1000000) return n-1000+1;
        else if(n<1000000000){
            long t = n-1000+1;
            return t+(n-1000000)+1;
        }
        else if(n<1000000000000L){
            long t = n-1000+1;
            return t+(n-1000000)+1+(n-1000000000)+1;
        }
        else{
            long t = n-1000+1;
            return t+(n-1000000)+1+(n-1000000000)+1+(n-1000000000000L)+1;
        }
    }
}