// Problem: Find All Lonely Numbers in the Array
// Language: java

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,(map.getOrDefault(i,0))+1);
            s.add(i);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                if(!s.contains(nums[i]-1) && !s.contains(nums[i]+1)) l.add(nums[i]);
            }
        }
        return l;
    }
}