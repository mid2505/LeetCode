// Problem: Rotate Array
// Language: java

class Solution {
    public void rotate(int[] nums, int k) {
        int n = Math.abs(nums.length-(k%nums.length));
        int[] arr = Arrays.copyOf(nums,nums.length);
        System.out.println(n);
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[n%nums.length];
            n++;
        }
    }
}