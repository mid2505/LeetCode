// Problem: Find the Difference of Two Arrays
// Language: java

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums1){
            s.add(i);
        }
        Set<Integer> s1 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            s1.add(nums2[i]);
        }
        List<List<Integer>> l = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(s);
        set1.removeAll(s1);
        Set<Integer> set2 = new HashSet<>(s1);
        set2.removeAll(s);
        List<Integer> temp = new ArrayList<>();
        for(int i : set1){
            temp.add(i);
        }
        List<Integer> temp1 = new ArrayList<>();
        l.add(temp);
        for(int i : set2){
            temp1.add(i);
        }
        l.add(temp1);
        return l;
    }
}