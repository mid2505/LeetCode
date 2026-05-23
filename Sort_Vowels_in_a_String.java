// Problem: Sort Vowels in a String
// Language: java

class Solution {
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder();
        List<Integer> l = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1) l.add((int)ch);
        }
        Collections.sort(l);
        int i=0;
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)==-1) ans.append(ch+"");
            else ans.append(""+(char)(l.get(i++)+0));
        }
        return ans.toString();
    }
}