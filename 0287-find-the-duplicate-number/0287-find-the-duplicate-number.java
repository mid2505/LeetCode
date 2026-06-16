class Solution {
    public int findDuplicate(int[] nums) {
        boolean vis[] = new boolean[nums.length];
        for(int i : nums){
            if(vis[i]) return i;
            else vis[i]=true;
        }
        return -1;
    }
}