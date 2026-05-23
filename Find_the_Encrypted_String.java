// Problem: Find the Encrypted String
// Language: java

class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder ans = new StringBuilder();
        if(k>s.length()){
            k = k%s.length();
        }
        for(int i=k;i<s.length();i++){
            ans.append(s.charAt(i));
        }
        for(int i=0;i<k;i++){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    
}