// Problem: Largest Local Values in a Matrix
// Language: java

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                ans[i][j] = findmax(grid,i,j);
            }
        }
        return ans;
    }
    public int findmax(int[][] inp, int x, int y){
        int ans = 0;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(inp[i][j] > ans){
                    ans = inp[i][j];
                }
            }
        }
        return ans;
    }
}