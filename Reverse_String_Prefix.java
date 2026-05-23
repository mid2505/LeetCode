// Problem: Reverse String Prefix
// Language: java

class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder s1 = new StringBuilder();
        k--;
        for(int i=0;i<s.length();i++){
            if(k>=0) s1.append(s.charAt(k--));
            else s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}