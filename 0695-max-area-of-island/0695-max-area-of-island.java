class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        Deque<List<Integer>> q = new ArrayDeque<>();
        int[] row = {1,0,-1,0};
        int[] col = {0,1,0,-1};
        int area = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    area=0;
                    vis[i][j] = true;
                    q.offerLast(List.of(i,j));
                    while(!q.isEmpty()){
                        area++;
                        List<Integer> l = q.pollFirst();
                        for(int x=0;x<4;x++){
                            int r = row[x]+l.get(0);
                            int c = col[x]+l.get(1);
                            if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1 && !vis[r][c]){
                                vis[r][c] = true;
                                q.offerLast(List.of(r,c));
                            }
                        }
                    }
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
}