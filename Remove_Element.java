// Problem: Remove Element
// Language: java

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==val) count++;
        }
        int it = 0;
        i=0;
        while(i<nums.length){
            if(nums[i]==val){
                it++;
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                if(it<count) continue;
            }
            i++;
        }
        return nums.length-count;
    }
}