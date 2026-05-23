// Problem: Difference Between Ones and Zeros in Row and Column
// Language: java

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int ans[][] = new int[grid.length][grid[0].length];
        int[] onesRow = new int[grid.length];
        int[] onesCol = new int[grid[0].length];
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                onesRow[i]+=grid[i][j];
                onesCol[j]+=grid[i][j];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                ans[i][j] = onesRow[i]+onesCol[j]-(m-onesRow[i])-(n-onesCol[j]);
            }
        }
        return ans;
    }
}