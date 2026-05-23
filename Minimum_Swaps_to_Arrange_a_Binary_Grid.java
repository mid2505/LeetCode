// Problem: Minimum Swaps to Arrange a Binary Grid
// Language: java

class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid[0].length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0)
                    count++;
                else
                    break;
            }
            arr[i] = count;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int need = n - i - 1;
            int j = i;
            while (j < n && arr[j] < need)
                j++;
            if (j == n)
                return -1;
            while (j > i) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                count++;
                j--;
            }
        }
        return count;
    }
}