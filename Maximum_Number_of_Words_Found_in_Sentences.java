// Problem: Maximum Number of Words Found in Sentences
// Language: java

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s : sentences){
            String[] str = s.split(" ");
            if(max < str.length) max = str.length;
        }
        return max;
    }
}