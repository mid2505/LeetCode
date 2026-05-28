class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(r>l){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);
                    l++;
                    r--;
                }
                else if(sum>0) r--;
                else l++;
            }
        }
        List<List<Integer>> fin = new ArrayList<>(ans);
        return fin;
    }
}