// Problem: Product of Array Except Self
// Language: java

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        int i=1;
        int j=nums.length-2;
        prefixProd[0]= 1;
        suffixProd[nums.length-1]= 1;
        int pp = prefixProd[0];
        int sp = suffixProd[nums.length-1];
        while(i<nums.length){
            pp = pp*nums[i-1];
            sp = sp*nums[j+1];
            prefixProd[i++] = pp;
            suffixProd[j--] = sp;
        }
        for(i=0;i<nums.length;i++){
            System.out.println(prefixProd[i]+" "+suffixProd[i]);
        }
        for(i=0;i<nums.length;i++){
            nums[i] = prefixProd[i]*suffixProd[i];
        }
        return nums;
    }
}