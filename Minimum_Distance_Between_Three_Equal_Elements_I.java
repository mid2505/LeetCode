// Problem: Minimum Distance Between Three Equal Elements I
// Language: java

class Solution {
    public int minimumDistance(int[] nums) {
        int min = 999;
        if(nums.length<3){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(ifgood(nums[i],nums[j],nums[k])){
                        if(min>absc(i,j,k)){
                            min = absc(i,j,k);
                        }
                    }
                }
            }
        }
        return min!=999?min:-1;
    }
    
    public boolean ifgood(int a, int b, int c){
        return (a==b && b==c);
    }

    public int absc(int a, int b, int c){
        return Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
    }
}