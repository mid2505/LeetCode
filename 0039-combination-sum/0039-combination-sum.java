class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Stack<Integer> st = new Stack<>();
        f(0,candidates,0,target,st);
        return l;
    }
    public void f(int idx, int[] candidates,int sum, int target, Stack<Integer> st){
        if(idx>=candidates.length){
            if(sum==target){
                List<Integer> temp = new ArrayList<>();
                for(int i : st){
                    temp.add(i);
                }
                l.add(temp);
            }
            return;
        }
        if(sum<=target){
            st.push(candidates[idx]);
            sum+=candidates[idx];
            f(idx,candidates,sum,target,st);
            st.pop();
            sum-=candidates[idx];
        }
        f(idx+1,candidates,sum,target,st);
    }
}