class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length; int n = grid[0].length;
        k = k%(m*n);
        if(k==0){
            List<List<Integer>> l = new ArrayList<>();
            for(int i=0;i<m;i++){
                List<Integer> t = new ArrayList<>();
                for(int j = 0;j<n;j++){
                    t.add(grid[i][j]);
                }
                l.add(t);
            }
            return l;
        }
        List<List<Integer>> l = revAll(grid,m,n);
        int s = 0;
        int e = k-1;
        while(s<e){
            int ir = s/n;
            int ic = s%n;
            int jr = e/n;
            int jc = e%n;
            swap(l,ir,ic,jr,jc);
            s++;
            e--;
        }
        s = k;
        e = (m*n)-1;
        while(s<e){
            int ir = s/n;
            int ic = s%n;
            int jr = e/n;
            int jc = e%n;
            swap(l,ir,ic,jr,jc);
            s++;
            e--;
        }
        System.gc();
        return l;
    }
    public List<List<Integer>> revAll(int[][] grid, int m, int n){
        List<List<Integer>> l = new ArrayList<>();
        for(int i=m-1;i>=0;i--){
            List<Integer> t = new ArrayList<>();
            for(int j = n-1;j>=0;j--){
                t.add(grid[i][j]);
            }
            l.add(t);
        }
        return l;
    }
    public void swap(List<List<Integer>> l, int ir, int ic, int jr, int jc){
        int temp = l.get(ir).get(ic);
        l.get(ir).set(ic,l.get(jr).get(jc));
        l.get(jr).set(jc,temp);
        return;
    }
}