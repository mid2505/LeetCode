// Problem: Prime Number of Set Bits in Binary Representation
// Language: java

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left; i<=right;i++){
            int temp = Integer.bitCount(i);
            System.out.println(temp);
            boolean flag = false;
            if(temp==1 || temp==0) continue;
            for(int j = 2;j<=Math.sqrt(temp);j++){
                if(temp%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag) ans++;
        }
        return ans;
    }
}