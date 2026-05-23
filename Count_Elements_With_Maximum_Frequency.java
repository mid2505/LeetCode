// Problem: Count Elements With Maximum Frequency
// Language: java

class Solution {
    public int maxFrequencyElements(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])) l.add(nums[i]);
        }
        int max=0;
        int ans=0;
        for(int i=0;i<l.size();i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(l.get(i)==nums[j]){
                    temp++;
                }
            }
            System.out.println(temp);
            if(temp>max){
                max=temp;
                ans = max;
            }
            else if(temp==max){
                ans+=temp;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}