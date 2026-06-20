class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        for(int[] i : edges){
            int u = i[0];
            int v = i[1];
            int wt = i[2];
            map.computeIfAbsent(u,k -> new ArrayList<>()).add(new int[]{v,wt});
            map.computeIfAbsent(v,k -> new ArrayList<>()).add(new int[]{u,wt});
        }
        for(int i=0;i<n;i++){
            int[] dist = new int[n];
            Arrays.fill(dist,100_000_000);
            dist[i]=0;
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
            pq.add(new int[]{0,i});
            while(!pq.isEmpty()){
                int[] cur = pq.poll();
                int distance = cur[0];
                int node = cur[1];
                List<int[]> l= map.getOrDefault(node, Collections.emptyList());
                for(int[] x : l){
                    if(distance + x[1] < dist[x[0]]){
                        dist[x[0]] = distance + x[1];
                        pq.add(new int[]{dist[x[0]],x[0]});
                    }
                }
            }
            int count = 0;
            for(int x : dist){
                if(x!=0 && x<=distanceThreshold){
                    count++;
                }
            }
            if(count<min){
                min = count;
                minIdx = i;
            }
            else if(count==min){
                minIdx = Math.max(minIdx,i);
            }
        }
        return minIdx;
    }
}