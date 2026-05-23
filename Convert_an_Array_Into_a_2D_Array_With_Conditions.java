// Problem: Convert an Array Into a 2D Array With Conditions
// Language: java

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
        }
        for(int i=0;i<n.size();i++){
            boolean flag = false;
            //List<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<l.size();j++){
                if(!l.get(j).contains(n.get(i))){
                    l.get(j).add(n.get(i));
                    n.remove(i);
                    i--;
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            else{
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(n.get(i));
                l.add(temp);
            }
        }
        return l;
    }
}