// Problem:   Count Symmetric Integers
// Language: java

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int x=low;x<=high;x++){
            int ans = 0;
            int c = 0;
            int t = x;
            while(t>0){
                c++;
                t/=10;
            }
            if(c%2!=0 && c%10==0) x*=10;
            else if(c%2!=0 && c%10!=0) continue;
            else if(c%2==0){
                int tAgain = x;
                int leftSum = 0;
                int rightSum = 0;
                for(int i=0;i<c/2;i++){
                    rightSum+=tAgain%10;
                    tAgain/=10;
                }
                for(int i=c/2;i<c;i++){
                    leftSum+=tAgain%10;
                    tAgain/=10;
                }
                if(rightSum==leftSum) count++;
            }  
        }
        return count;
    }
}