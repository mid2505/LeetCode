class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int[] row = {1,0,-1,0};
        int[] col = {0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && i!=(n-1) && j!=0 && j!=(m-1) && !vis[i][j] && grid[i][j]==0){
                    Deque<int[]> q = new ArrayDeque<>();
                    q.offerLast(new int[]{i,j});
                    boolean flag = false;
                    while(!q.isEmpty()){
                        int[] cur = q.pollFirst();
                        vis[cur[0]][cur[1]]=true;
                        for(int x=0;x<4;x++){
                            int r = cur[0]+row[x];
                            int c = cur[1]+col[x];
                            if(r>=0 && r<n && c>=0 && c<m && !vis[r][c] && grid[r][c]==0){
                                if(r==0 || r==(n-1) || c==0 || c==(m-1)){
                                    flag = true;
                                }
                                else{
                                    q.offerLast(new int[]{r,c});
                                }
                            }
                        }
                    }
                    if(!flag) count++;
                }
            }
        }
        return count;
    }
}