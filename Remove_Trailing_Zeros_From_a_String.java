// Problem: Remove Trailing Zeros From a String
// Language: java

class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s = new StringBuilder();
        boolean flag = false;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0' || flag){
                flag = true;
                s.append(num.charAt(i));
            }
        }
        s.reverse();
        return s.toString();
    }
}