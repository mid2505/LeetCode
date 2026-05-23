// Problem: Find Most Frequent Vowel and Consonant
// Language: java

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vmap = new HashMap<>();
        HashMap<Character,Integer> cmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                if(vmap.get(s.charAt(i)) != null)
                    vmap.put(s.charAt(i),(vmap.get(s.charAt(i)))+1);
                else
                    vmap.put(s.charAt(i),1);
            }
            else{
                if(cmap.get(s.charAt(i)) != null)
                    cmap.put(s.charAt(i),(cmap.get(s.charAt(i)))+1);
                else
                    cmap.put(s.charAt(i),1);
            }
        }
        int v=!vmap.isEmpty()?Collections.max(vmap.values()):0;
        int c=!cmap.isEmpty()?Collections.max(cmap.values()):0;
        return v+c;
    }
}