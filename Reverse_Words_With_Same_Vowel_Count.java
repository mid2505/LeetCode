// Problem: Reverse Words With Same Vowel Count
// Language: java

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder s1 = new StringBuilder(str[0]);
        if(str.length==1 || str.length==0){
            return str[0];
        }
        else{
            s1.append(" ");
        }
        int count=find_vowel_count(str[0]);
        for(int i=1;i<str.length;i++){
            if(count==find_vowel_count(str[i])){
                StringBuilder m = new StringBuilder(str[i]);
                m.reverse();
                s1.append(m);
                if(i!=str.length-1) s1.append(" ");
            }
            else{
                s1.append(str[i]);
                if(i!=str.length-1) s1.append(" ");
            }
        }
        return s1.toString();
    }
    public int find_vowel_count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
}