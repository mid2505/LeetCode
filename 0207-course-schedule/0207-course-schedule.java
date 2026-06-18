class Solution {
    public boolean canFinish(int n, int[][] p) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(i,new ArrayList<>());
        for(int[] i : p){
            int u = i[0];
            int v = i[1];
            map.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
            map.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
        }
        int[] inDegree = new int[n];
        for(int[] i : p){
            inDegree[i[1]]++;
        }
        List<Integer> topo = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++) if(inDegree[i]==0) q.offerLast(i);
        while(!q.isEmpty()){
            int cur = q.pollFirst();
            topo.add(cur);
            for(int i : map.get(cur)){
                inDegree[i]--;
                if(inDegree[i]==0) q.offerLast(i);
            }
        }
        return topo.size()==n;
    }
}