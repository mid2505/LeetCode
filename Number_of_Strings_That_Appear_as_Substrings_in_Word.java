// Problem: Number of Strings That Appear as Substrings in Word
// Language: java

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(in_or_out(patterns[i],word)) count++;
        }
        return count;
    }
    public boolean in_or_out(String s, String word){
        StringBuilder ans = new StringBuilder(word);
        if(ans.indexOf(s)!=-1) return true;
        return false;
    }
}