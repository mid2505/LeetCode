class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            boolean flag = false;
            if(st.isEmpty()) st.push(i);
            else if(st.peek()<0 && i>0) st.push(i);
            else if(st.peek()<0 && i<0) st.push(i);
            else if(st.peek()>0 && i>0) st.push(i);
            else{
                if(st.isEmpty()){
                    st.push(i);
                    continue;
                }
                else{
                    while(!st.isEmpty()){
                        int n = Math.abs(st.peek());
                        if(st.isEmpty()){
                            st.push(i);
                            break;
                        }
                        else if(st.peek()<0 && i>0){
                            st.push(i);
                            break;
                        }
                        else if(st.peek()<0 && i<0){
                            st.push(i);
                            break;
                        }
                        else if(st.peek()>0 && i>0){
                            st.push(i);
                            break;
                        }
                        else if(Math.abs(i)>n){
                            st.pop();
                        }
                        else if(Math.abs(i)==n){
                            st.pop();
                            flag = true;
                            break;
                        }
                        else{
                            flag = true;
                            break;
                        }
                    }
                    if(st.isEmpty() && !flag) st.push(i);
                }
            }
        }
        int[] ans = new int[st.size()];
        int x=0;
        for(int i:st) ans[x++]=i;
        return ans;
    }
}