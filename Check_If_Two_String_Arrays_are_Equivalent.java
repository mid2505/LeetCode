// Problem: Check If Two String Arrays are Equivalent
// Language: java

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        for(String str : word1){
            s.append(str);
        }
        String s1 = s.toString();
        for(String str : word2){
            ss.append(str);
        }
        String s2 = ss.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}