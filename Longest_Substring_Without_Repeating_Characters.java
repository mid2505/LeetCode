// Problem: Longest Substring Without Repeating Characters
// Language: java

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int st = 0;
        List<Character> s1 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!s1.contains(s.charAt(i))){
                s1.add(s.charAt(i));
            }
            else{
                i=++st;
                s1.clear();
                s1.add(s.charAt(i));
            }
            if(s1.size()>max){
                max = s1.size();                
            }
        }
        return max;
    }
}