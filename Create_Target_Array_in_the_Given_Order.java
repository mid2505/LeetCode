// Problem: Create Target Array in the Given Order
// Language: java

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}