// Problem: Split a String in Balanced Strings
// Language: java

class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else l++;

            if(l==r){
                ans++;
                r=0;
                l=0;
            }
        }
        return ans;
    }
}