class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Stack<Integer> st = new Stack<>();
        f(0,candidates,0,target,st);
        return l;
    }
    public void f(int idx, int[] candidates,int sum, int target, Stack<Integer> st){
        if(sum==target){
            List<Integer> temp = new ArrayList<>();
            for(int i : st){
                temp.add(i);
            }
            l.add(temp);
            return;
        }
        for(int i = idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(sum+candidates[i]>target) break;
            st.push(candidates[i]);
            sum+=candidates[i];
            f(i+1,candidates,sum,target,st);
            st.pop();
            sum-=candidates[i];
        }
    }
}