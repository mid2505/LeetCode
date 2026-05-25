class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] arr = new int[100+1];
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
            if(arr[i]<k) l.add(i);
            arr[i]++;
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}