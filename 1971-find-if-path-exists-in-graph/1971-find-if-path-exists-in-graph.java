class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> adjMap = new HashMap<>();
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            adjMap.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
            adjMap.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
        }
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();
        st.push(source);
        while(!st.isEmpty()){
            int node = st.pop();
            if(node==destination) return true;
            if(!vis[node]){
                vis[node] = true;
                if (!adjMap.containsKey(node)) continue;
                List<Integer> temp = adjMap.get(node);
                for(Integer i : temp){
                    if(!vis[i]) st.push(i);
                }
            }
        }
        return false;
    }
}