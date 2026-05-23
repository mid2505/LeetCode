// Problem: Uncommon Words from Two Sentences
// Language: java

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> s = new ArrayList<>();
        List<String> l = new ArrayList<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        int n=0;
        while(n<(str1.length)){
            if(!s.contains(str1[n]) && !l.contains(str1[n])) s.add(str1[n]);
            else{
                l.add(str1[n]);
                s.remove(str1[n]);
            }
            n++;
        }
        n=0;
        while(n<(str2.length)){
            if(!s.contains(str2[n]) && !l.contains(str2[n])) s.add(str2[n]);
            else{
                l.add(str2[n]);
                s.remove(str2[n]);
            }
            n++;
        }
        return s.toArray(new String[0]);
    }
}