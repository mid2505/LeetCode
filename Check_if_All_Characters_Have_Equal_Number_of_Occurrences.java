// Problem: Check if All Characters Have Equal Number of Occurrences
// Language: java

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int inst=0;
        for(int i=0;i<s.length();i++){
            int temp=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    temp++;
                }
            }
            if(inst==0){
                inst=temp;
            }
            if(!(temp==inst)){
                return false;
            }
        }
        return true;
    }
}