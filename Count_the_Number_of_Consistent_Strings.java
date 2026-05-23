// Problem: Count the Number of Consistent Strings
// Language: java

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ac=0;
        List<Character> ls = new ArrayList<>();
        for(int i=0;i<allowed.length();i++){
            ls.add(allowed.charAt(i));
        }
        for(String s : words){
            boolean flag = false;
            for(int i=0;i<s.length();i++){
                if(!ls.contains(s.charAt(i))) flag = true;
            }
            if(!flag) ac++;
        }
        return ac;
    }
}