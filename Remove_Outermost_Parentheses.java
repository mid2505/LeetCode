// Problem: Remove Outermost Parentheses
// Language: java

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int ob = 0;
        int cb = 0;
        int ihold = 0;
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && !flag){ 
                ob++;
                ihold = i;
                flag = true;
            }
            else if(s.charAt(i)=='(' && flag){
                ob++;
                //ihold = i;
                //flag = true;
            }
            else{
                cb++;
            }
            if(ob==cb && ob!=0){
                for(int j=ihold+1;j<(ihold+ob+cb-1);j++){
                    ans.append(s.charAt(j));
                }
                ob = 0;
                cb = 0;
                flag = false;
            }
        }
        return ans.toString();
    }
}