// Problem: Find First Palindromic String in the Array
// Language: java

class Solution {
    public String firstPalindrome(String[] words) {
        boolean flag = false;
        for(String w : words){
            flag = false;
            for(int i=0;i<w.length();i++){
                if(!(w.charAt(i)==w.charAt(w.length()-i-1))){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return w;
            }
        }
        return "";
    }
}