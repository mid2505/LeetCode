// Problem: Check Balanced String
// Language: java

class Solution {
    public boolean isBalanced(String num) {
        int e=0;
        int o=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                e+=Integer.parseInt(""+num.charAt(i));
            }
            else{
                o+=Integer.parseInt(""+num.charAt(i));
            }
        }
        if(o==e) return true;
        return false;
    }
}