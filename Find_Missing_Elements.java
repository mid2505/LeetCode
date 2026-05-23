// Problem: Find Missing Elements
// Language: java

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        List<Integer> n = new ArrayList<>();
        for(int i:nums) n.add(i);
        List<Integer> l = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!n.contains(i)) l.add(i);
        }
        return l;
    }
}