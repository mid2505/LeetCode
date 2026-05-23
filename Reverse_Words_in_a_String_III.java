// Problem: Reverse Words in a String III
// Language: java

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder ss = new StringBuilder();
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                ss.append(str[i].charAt(j));
            }
            if(i!=str.length-1){
                ss.append(" ");
            }
        }
        return ss.toString();
    }
}