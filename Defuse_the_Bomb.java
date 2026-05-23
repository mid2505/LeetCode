// Problem: Defuse the Bomb
// Language: java

class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            int[] ans = new int[code.length];
            return ans;
        }
        else if(k>0){
            int[] ans = new int[code.length];
            for(int i=0;i<code.length;i++){
                int temp = Math.abs(k);
                int sum = 0;
                int j = i+1;
                if(j==code.length){
                        j=0;
                }
                while(temp>0){
                    sum+=code[j%code.length];
                    j++;
                    temp--;
                }
                ans[i] = sum;
            }
            return ans;
        }
        else{
            int[] ans = new int[code.length];
            for(int i=0;i<code.length;i++){
                int temp = Math.abs(k);
                int sum = 0;
                int j = i-1;
                if(j==-1){
                        j=code.length-1;
                }
                while(temp>0){
                    sum+=code[j];
                    if(j==0){
                        j=code.length-1;
                    }
                    else j--;
                    temp--;
                }
                ans[i] = sum;
            }
            return ans;
        }
    }
}