// Problem: Replace All Digits with Characters
// Language: java

class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                ans.append(s.charAt(i));
            }
            else{
                ans.append(""+(char)(((int)s.charAt(i-1))+Integer.parseInt(""+s.charAt(i))));
            }
        }
        return ans.toString();
    }
}