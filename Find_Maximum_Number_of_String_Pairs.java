// Problem: Find Maximum Number of String Pairs
// Language: java

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            StringBuilder s = new StringBuilder(words[i]);
            s.reverse();
            for(int j=i+1;j<words.length;j++){
                if(words[j].equals(s.toString()) && i!=j){
                    count++;
                }
            }
        }
        return count;
    }
}