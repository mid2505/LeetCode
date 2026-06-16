class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<List<Integer>> q = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh=0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    l.add(0);
                    q.offerLast(l);
                }
                else{
                    vis[i][j]=false;
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        int time = 0;
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        while(!q.isEmpty()){
            List<Integer> temp = q.pollFirst();
            int r = temp.get(0);
            int c = temp.get(1);
            int t = temp.get(2); 
            for(int i=0;i<4;i++){
                if(r+row[i]>=0 && r+row[i]<m && c+col[i]>=0 && c+col[i]<n && grid[r+row[i]][c+col[i]]==1 && !vis[r+row[i]][c+col[i]]){
                    vis[r+row[i]][c+col[i]]=true;
                    List<Integer> l = new ArrayList<>();
                    l.add(r+row[i]);
                    l.add(c+col[i]);
                    l.add(t+1);
                    q.offerLast(l);
                    time = Math.max(time,t+1);
                    fresh--;
                }
            }
        }
        if(fresh<=0) return time;
        else return -1;
    }
}