// Problem: Find Common Elements Between Two Arrays
// Language: java

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();

        for(int i : nums1){
            l1.add(i);
        }
        for(int i : nums2){
            l2.add(i);
        }
        
        int arr[] = new int[2];

        for(int i=0;i<nums1.length;i++){
            if(l2.contains(nums1[i])) arr[0]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(l1.contains(nums2[i])) arr[1]++;
        }

        return arr;
    }
}