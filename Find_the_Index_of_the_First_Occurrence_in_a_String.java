// Problem: Find the Index of the First Occurrence in a String
// Language: java

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        for(int i=0;i<haystack.length();i++){
            int x = i;
            int y = 0;
            int count = 0;
            while(y<needle.length() && x<haystack.length()){
                if(haystack.charAt(x)==needle.charAt(y)){
                    count++;
                }
                else break;
                x++;
                y++;
            }
            if(count==needle.length()) return i;
        }
        return -1;
    }
}