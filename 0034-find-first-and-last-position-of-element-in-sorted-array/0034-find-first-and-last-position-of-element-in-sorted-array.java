class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = nums.length/2;
        while(l<=r){
            if(target<nums[l] || target>nums[r]) return new int[]{-1,-1};
            mid = l + (r-l)/2;
            if(target==nums[mid]){
                int a = 0;
                int b = 0;
                for(int i=l;i<=r;i++){
                    if(target==nums[i]){
                        a=i;
                        break;
                    }
                }
                for(int i=r;i>=l;i--){
                    if(target==nums[i]){
                        b=i;
                        break;
                    }
                }
                return new int[]{a,b};
            }
            else if(target<nums[mid]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}