// Problem: To Lower Case
// Language: java

class Solution {
    public String toLowerCase(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)<91 && (int)s.charAt(i)>=65) s1.append((char)((int)s.charAt(i)+32));
            else s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}