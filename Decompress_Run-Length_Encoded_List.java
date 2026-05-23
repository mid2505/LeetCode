// Problem: Decompress Run-Length Encoded List
// Language: java

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            int f = nums[i];
            int v = nums[i+1];
            for(int j=0;j<f;j++){
                l.add(v);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}