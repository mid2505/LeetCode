class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        int[][] vis = new int[m][n];
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        int count = 0;
        Deque<List<Integer>> q = new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid2[i][j]!=0){
                    boolean isSubIsland = true;
                    vis[i][j] = 1;
                    q.offerLast(List.of(i,j));
                    while(!q.isEmpty()){
                        List<Integer> l = q.pollFirst();
                        for(int x=0;x<4;x++){
                            if(grid1[l.get(0)][l.get(1)]==0) isSubIsland=false;
                            int r = l.get(0)+row[x];
                            int c = l.get(1)+col[x];
                            if(r>=0 && r<m && c>=0 && c<n && grid2[r][c]!=0 && vis[r][c]==0){
                                vis[r][c] = 1;
                                q.offerLast(List.of(r,c));
                            }
                        }
                    }
                    if(isSubIsland) count++;
                }
            }
        }
        return count;
    }
}