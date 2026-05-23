// Problem: Minimum Number Game
// Language: java

class Solution {
    public int[] numberGame(int[] nums) {
        int abuf;
        int bbuf;
        List<Integer> l= new ArrayList<Integer>();
        List<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++){
            abuf = Collections.min(l);
            l.remove(Collections.min(l));
            bbuf = Collections.min(l);
            l.remove(Collections.min(l));
            ans.add(bbuf);
            ans.add(abuf);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}