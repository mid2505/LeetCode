class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<dislikes.length;i++){
            int u = dislikes[i][0]-1;
            int v = dislikes[i][1]-1;
            temp = map.get(u);
            temp.add(v);
            map.put(u,temp);
            temp = map.get(v);
            temp.add(u);
            map.put(v,temp);
        }
        boolean[] vis = new boolean[n];
        int[] col = new int[n];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                col[i]=0;
                q.offerLast(i);
                while(!q.isEmpty()){
                    int cur = q.pollFirst();
                    List<Integer> l = map.get(cur);
                    for(int x : l){
                        if(!vis[x]){
                            vis[x] = true;
                            col[x] = 1-col[cur];
                            q.offerLast(x);
                        }
                        else if(col[x]!=1-col[cur]) return false;
                    }   
                }
            }
        }
        return true;
    }
}