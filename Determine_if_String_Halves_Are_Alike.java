// Problem: Determine if String Halves Are Alike
// Language: java

class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1) count1++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1) count2++;
        }
        return count1==count2;
    }
}