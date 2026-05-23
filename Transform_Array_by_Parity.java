// Problem: Transform Array by Parity
// Language: java

class Solution {
    public int[] transformArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = (nums[i]%2==0)?0:1;
        }
        Arrays.sort(arr);
        return arr;
    }
}