// Problem: Redistribute Characters to Make All Strings Equal
// Language: java

class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1) return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(String s : words){
            for(char ch : s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue()%words.length!=0) return false;
        }
        return true;
    }
}