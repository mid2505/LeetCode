// Problem: Count Partitions with Even Sum Difference
// Language: java

class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(find_sum(nums,0,i)-find_sum(nums,i,nums.length))%2==0){
                count++;
            }
        }
        return count;
    }
    public int find_sum(int[] nums, int x,int j){
        int sum=0;
        for(int i=x;i<j;i++){
            sum+=nums[i];
        }
        return sum;
    }
}