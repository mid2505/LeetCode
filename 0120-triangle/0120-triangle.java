class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n==1) return triangle.get(0).get(0);
        solve(triangle,n-2);
        System.out.println(triangle);
        return triangle.get(0).get(0);
    }
    public void solve(List<List<Integer>> t,int idx){
        if(idx==-1) return;
        int n = t.get(idx).size();
        List<Integer> l = t.get(idx);
        for(int i=0;i<n;i++){
            int val = Math.min(t.get(idx+1).get(i),t.get(idx+1).get(i+1));
            l.set(i,l.get(i)+val);
        }
        t.set(idx,l);
        solve(t,idx-1);
    }
}