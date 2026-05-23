// Problem: First Letter to Appear Twice
// Language: java

class Solution {
    public char repeatedCharacter(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s1.indexOf(Character.toString(s.charAt(i)))==-1) s1.append(s.charAt(i));
            else return s.charAt(i);
        }
        return 'a';
    }
}