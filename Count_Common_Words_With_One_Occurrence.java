// Problem: Count Common Words With One Occurrence
// Language: java

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        List<String> sp = new ArrayList<String>();
        //List<String> l2 = new ArrayList<String>();
        for(int i=0;i<words1.length;i++){
            if(!s1.contains(words1[i]) && !sp.contains(words1[i])) s1.add(words1[i]);
            else{
                sp.add(words1[i]);
                s1.remove(words1[i]);
            }
        }
        sp.clear();
        for(int i=0;i<words2.length;i++){
            if(!s2.contains(words2[i]) && !sp.contains(words2[i])) s2.add(words2[i]);
            else{
                sp.add(words2[i]);
                s2.remove(words2[i]);
            }
        }
        s1.retainAll(s2);
        return s1.size();
    }
}