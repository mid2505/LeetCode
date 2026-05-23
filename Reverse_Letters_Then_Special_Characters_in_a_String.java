// Problem: Reverse Letters Then Special Characters in a String
// Language: java

class Solution {
    public String reverseByType(String s) {
        Stack<Character> stc = new Stack<>();
        Stack<Character> sts = new Stack<>(); 
        for(char ch : s.toCharArray()){
            if("qwertyuiopasdfghjklzxcvbnm".indexOf(ch)!=-1) stc.push(ch);
            else sts.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if("qwertyuiopasdfghjklzxcvbnm".indexOf(ch)!=-1) ans.append(stc.pop()+"");
            else ans.append(sts.pop()+"");
        }
        return ans.toString();
    }
}