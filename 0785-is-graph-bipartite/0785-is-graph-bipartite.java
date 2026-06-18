class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        int[] color = new int[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                Stack<Integer> st = new Stack<>();
                vis[i]=true;
                color[i]=0;
                st.push(i);
                while(!st.isEmpty()){
                    int cur = st.pop();
                    for(int j : graph[cur]){
                        if(!vis[j]){
                            vis[j] = true;
                            color[j] = 1-color[cur];
                            st.push(j);
                        }
                        else{
                            if(color[j]!=1-color[cur]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}