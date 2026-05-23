// Problem: Majority Element
// Language: java

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry m:map.entrySet()){
            if((int)m.getValue()>nums.length/2) return (int)m.getKey();
        }
        return 0;
    }
}