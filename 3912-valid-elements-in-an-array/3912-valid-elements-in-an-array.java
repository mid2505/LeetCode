class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        if(n==1){
            l.add(nums[0]);
            return l;
        }
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        int lMax = nums[0];
        int rMax = nums[n-1];
        
        leftMax[0] = lMax;
        rightMax[n-1] = rMax;

        for(int i=1;i<n;i++){
            lMax = Math.max(lMax,nums[i]);
            rMax = Math.max(rMax,nums[n-1-i]);

            leftMax[i] = lMax;
            rightMax[n-i-1] = rMax;
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(leftMax[i] + " " + rightMax[i]);
        // }
        
        l.add(nums[0]);
        for(int i=1;i<n-1;i++){
            if(nums[i]>leftMax[i-1] || nums[i]>rightMax[i+1]) l.add(nums[i]);
        }
        l.add(nums[n-1]);
        return l;
    }
}