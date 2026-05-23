// Problem: Reverse Prefix of Word
// Language: java

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int tar = -1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                tar = i;
                break;
            }
        }
        for(int i=tar;i>=0;i--){
            ans.append(word.charAt(i)+"");
        }
        for(int i = tar+1;i<word.length();i++){
            ans.append(word.charAt(i)+"");
        }
        return ans.toString();
    }
}