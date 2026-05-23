// Problem: Maximum Odd Binary Number
// Language: java

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        if(count==1){
            for(int i=0;i<s.length()-1;i++){
                s1.append("0");
            }
            s1.append("1");
        }
        else{
            for(int i=0;i<count-1;i++){
                s1.append("1");
            }
            for(int i=0;i<s.length()-count;i++){
                s1.append("0");
            }
            s1.append("1");
        }
        return s1.toString();
    }
}