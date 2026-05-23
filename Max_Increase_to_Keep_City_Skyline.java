// Problem: Max Increase to Keep City Skyline
// Language: java

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> t = new ArrayList<Integer>();
            for(int j=0;j<grid.length;j++){
                t.add(grid[j][i]);
            }
            l.add(t);
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int x = Collections.max(l.get(j));
                int y = Arrays.stream(grid[i]).max().getAsInt();
                ans+=(Math.min(x,y)-grid[i][j]);
            }
        }
        return ans;
    }
}