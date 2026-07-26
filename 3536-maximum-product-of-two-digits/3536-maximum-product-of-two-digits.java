class Solution {
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n>0){
            int t = n%10;
            if(max1<t){
                max2 = max1;
                max1 = t;
            }
            else{
                if(max2<t){
                    max2 = t;
                }
            }
            n/=10;
        }
        return max1*max2;
    }
}