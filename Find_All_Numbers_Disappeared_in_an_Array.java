// Problem: Find All Numbers Disappeared in an Array
// Language: java

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!s.contains(i)) l.add(i);
        }
        return l;
    }
}