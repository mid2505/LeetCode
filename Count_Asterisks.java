// Problem: Count Asterisks
// Language: java

class Solution {
    public int countAsterisks(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int ans = 0;
        boolean flag = true;
        for(int i=0;i<s1.length();i++){
            if(flag && s1.charAt(i)=='*'){
                ans++;
            }
            if(s1.charAt(i)=='|'){
                if(flag){
                    flag = false;
                }
                else{
                    flag = true;
                }
            }
        }
        return ans;
    }
}