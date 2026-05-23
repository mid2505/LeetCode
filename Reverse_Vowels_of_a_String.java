// Problem: Reverse Vowels of a String
// Language: java

class Solution {
    public String reverseVowels(String s) {
        int[] arr = new int[s.length()];
        List<Integer> l = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(""+s.charAt(i))!=-1){
                l.add(i);
            }
        }
        int x = l.size()-1;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(""+s.charAt(i))!=-1){
                s1.append(""+s.charAt(l.get(x)));
                x--;
            }
            else s1.append(""+s.charAt(i));
        }
        return s1.toString();
    }
}