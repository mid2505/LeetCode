// Problem: First Unique Even Element
// Language: java

class Solution {
    public int firstUniqueEven(int[] nums) {
        boolean falg = true;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i:nums){
            if(i%2==0) map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()==1) return m.getKey();
        }
        return -1;
    }
}