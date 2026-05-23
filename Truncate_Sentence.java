// Problem: Truncate Sentence
// Language: java

class Solution {
    public String truncateSentence(String s, int k) {
        String[] ans = s.split(" ");
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<k;i++){
            if(i!=k-1){
                s1.append(ans[i]);
                s1.append(" ");
            }
            else
                s1.append(ans[i]);
        }
        return s1.toString();
        
    }
}