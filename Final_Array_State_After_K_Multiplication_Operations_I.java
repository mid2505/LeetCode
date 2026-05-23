// Problem: Final Array State After K Multiplication Operations I
// Language: java

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int temp = find_min_idx(nums);
            nums[temp] *= multiplier;
        }
        return nums;
    }

    public int find_min_idx(int[] nums) {
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
}