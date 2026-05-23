// Problem: Clear Digits
// Language: java

class Solution {
    public String clearDigits(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                s1 = do_it(s1);
            }
        }
        return s1.toString();
    }
    public StringBuilder do_it(StringBuilder s){
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                s.deleteCharAt(i);
                s.deleteCharAt(i-1);
                break;
            }
        }
        return s;
    }
}