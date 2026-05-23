// Problem: Check If Digits Are Equal in String After Operations I
// Language: java

class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<s.length()-2;i++){
            s1 = do_it(s1);
        }
        if(s1.charAt(0)==s1.charAt(1)) return true;
        return false;
    }
    public StringBuilder do_it(StringBuilder s){
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int temp1 = Integer.parseInt(""+s.charAt(i));
            int temp2 = Integer.parseInt(""+s.charAt(i+1));
            s1.append((""+(temp1+temp2)%10));
        }
        return s1;
    }
}