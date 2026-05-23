// Problem: Sorting the Sentence
// Language: java

class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        StringBuilder ss = new StringBuilder();
        int x = 1;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(((int)str[j].charAt(str[j].length()-1)-48)==x){
                    for(int m=0;m<str[j].length()-1;m++){
                        ss.append(str[j].charAt(m));
                    }
                    if(x!=str.length) ss.append(" ");
                    x++;
                    break;
                }
            }
        }
        return ss.toString();
    }
}