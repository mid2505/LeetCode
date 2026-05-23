// Problem: Counting Words With a Given Prefix
// Language: java

class Solution {
    public int prefixCount(String[] words, String pref) {
        int cunt = words.length;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<pref.length();j++){
                if(words[i].charAt(j)!=pref.charAt(j) || words[i].length()<pref.length()){
                    cunt--;
                    break;
                } 
            }
        }
        return cunt;
    }
}