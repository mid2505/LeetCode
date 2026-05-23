// Problem: Find the Integer Added to Array I
// Language: java

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
            int x = Integer.MIN_VALUE;
            int y = Integer.MIN_VALUE;
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]>x){
                    x = nums1[i];
                }
                if(nums2[i]>y){
                    y = nums2[i];
                }
            }
            return y-x;
    }
}