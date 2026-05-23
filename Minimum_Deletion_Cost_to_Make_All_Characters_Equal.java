// Problem: Minimum Deletion Cost to Make All Characters Equal
// Language: java

class Solution {
    public long minCost(String s, int[] cost) {
        long l=0;
        HashMap<Character,Long> map = new HashMap<>();
        for(int i=0;i<cost.length;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0L)+cost[i]);
        }
        if(map.size()==1) return l;
        long[] c = new long[map.size()];
        int i=0;
        for(Map.Entry<Character,Long> entry : map.entrySet()){
            c[i++] = Long.parseLong(""+entry.getValue());
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        long min=Long.MAX_VALUE;
        for(int j=0;j<i;j++){
            l = 0;
            for(int k=0;k<i;k++){
                if(k!=j){
                    l=Math.addExact(l,c[k]);
                }
            }
            if(l<min){
                min = l;
            }
        }
        return min;
    }
}