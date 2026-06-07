class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Stack<Integer> st = new Stack<>();
        f(0,arr,0,k,n,st);
        return l;
    }
    public void f(int idx, int[] arr, int sum, int k, int n, Stack<Integer> st){
        if(st.size()>=k){
            if(sum==n){
                l.add(new ArrayList<>(st));
                return;
            }
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(sum+arr[i] > n) break;
            st.push(arr[i]);
            sum+=arr[i];
            f(i+1,arr,sum,k,n,st);
            st.pop();
            sum-=arr[i];
        }
    }
}