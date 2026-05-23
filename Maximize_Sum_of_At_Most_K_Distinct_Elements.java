// Problem: Maximize Sum of At Most K Distinct Elements
// Language: java

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        //for(int i:nums) System.out.print(i+" ");
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            set.add(nums[i]);
            if(set.size()==k){
                return set.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}