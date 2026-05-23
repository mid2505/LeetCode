// Problem: Minimize Array Sum Using Divisible Replacements
// Language: java

class Solution {
    public long minArraySum(int[] nums) {
        TreeMap<Long,Integer> map = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        for(int i:nums) max = Math.max(max,i);
        for(int i: nums) map.put((long)i,map.getOrDefault((long)i,0)+1);
        long sum = 0;
        for(Map.Entry<Long,Integer> m : map.entrySet()){
            long k = m.getKey();
            int v = m.getValue();
            if(v==0) continue;
            for(long i=k;i<=max;i+=k){
                if(map.containsKey(i) && map.get(i)!=0){
                    sum+=k*map.get(i);
                    map.put(i,0);
                }
            }
        }
        return sum;
    }
}