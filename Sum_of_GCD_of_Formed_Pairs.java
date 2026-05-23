// Problem: Sum of GCD of Formed Pairs
// Language: java

class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int[] prefixGcd = new int[nums.length];
        prefixGcd[0] = max;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            prefixGcd[i] = gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        //for(int i : prefixGcd) System.out.println(i);
        int i=0;
        int j=prefixGcd.length-1;
        long sum=0;
        while(i<prefixGcd.length/2){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b=(a%b);
            a= temp;
        }
        return a;
    }
}