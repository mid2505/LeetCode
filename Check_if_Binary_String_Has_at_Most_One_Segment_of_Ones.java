// Problem: Check if Binary String Has at Most One Segment of Ones
// Language: java

class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                flag = true;
                continue;
            }
            if(flag && s.charAt(i)=='1') return false;
        }
        return true;
    }
}