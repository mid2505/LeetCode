// Problem: Count Hills and Valleys in an Array
// Language: java

class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;
            int x = i + 1;
            int y = i - 1;
            while (x < nums.length && nums[x] == nums[i]) {
                x++;
            }
            while (y >= 0 && nums[y] == nums[i]) {
                y--;
            }
            if (y < 0 || x >= nums.length) continue;
            if ((nums[y] < nums[i] && nums[x] < nums[i]) ||
                (nums[y] > nums[i] && nums[x] > nums[i])) {
                ans++;
            }
        }
        return ans;
    }
}
