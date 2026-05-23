// Problem: Rearrange Array Elements by Sign
// Language: java

class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pq = new LinkedList<>();
        Queue<Integer> nq = new LinkedList<>();        
        for(int num : nums) {
            if(num > 0) {
                pq.add(num);
            } else {
                nq.add(num);
            }
        }
        int i = 0;
        boolean flag = true;
        
        while(i < nums.length) {
            if(flag) {
                nums[i++] = pq.poll();
            } else {
                nums[i++] = nq.poll();
            }
            flag = !flag;
        }
        return nums;
    }
}