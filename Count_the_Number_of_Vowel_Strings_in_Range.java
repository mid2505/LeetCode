// Problem: Count the Number of Vowel Strings in Range
// Language: java

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            if("aeiou".indexOf(words[i].charAt(0))!=-1 && "aeiou".indexOf(words[i].charAt(words[i].length()-1))!=-1) ans++;
        }
        return ans;
    }
}