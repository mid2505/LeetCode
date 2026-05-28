class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int val = nums[0]+nums[1]+nums[2];
        int min = Math.abs(target-val);
        int finalValue = val;
        for(int i=0;i<n-2;i++){
            int left = i+1; int right = n-1;
            while(right>left){
                val = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-val)<Math.abs(target-finalValue)){
                    finalValue = val;
                }
                if(val==target) return target;
                else if(val<target) left++;
                else right--;
            }
        }
        return finalValue;
    }
}