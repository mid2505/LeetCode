// Problem: Two Out of Three
// Language: java

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        Set<Integer> s1dup = new HashSet<>();
        
        for(int i:nums1) {s1.add(i); s1dup.add(i);}
        for(int i:nums2) s2.add(i);
        for(int i:nums3) s3.add(i);

        s1.retainAll(s2);
        s2.retainAll(s3);
        s1dup.retainAll(s3);

        s1.addAll(s2);
        s1.addAll(s1dup);

        return s1.stream().collect(Collectors.toList());

    }
}