// Problem: Trim Trailing Vowels
// Language: java

class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length()-1;
        while(n>=0){
            if("aeiou".indexOf(s.charAt(n))!=-1) n--;
            else break;
        }
        return s.substring(0,n+1);
    }
}