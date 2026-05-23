// Problem: Smallest Pair With Different Frequencies
// Language: java

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums.length<3) return new int[]{-1,-1};
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> key = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            key.add(m.getKey());
            val.add(m.getValue());

            System.out.println(m.getKey()+" "+m.getValue());
        }
        for(int i=1;i<key.size();i++){
            if(val.get(0)!=val.get(i)) return new int[]{key.get(0).intValue(),key.get(i).intValue()};
        }
        return new int[]{-1,-1};
    }
}