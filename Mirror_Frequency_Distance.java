// Problem: Mirror Frequency Distance
// Language: java

class Solution {
    public int mirrorFrequency(String s) {
        int sum=0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Character> mirror = new HashMap<>();
        List<Character> l = new ArrayList<>();
        int x=0;
        for(int i=97;i<123;i++) mirror.put((char)i,(char)(122-(x++)));
        x=0;
        for(int i=48;i<58;i++) mirror.put((char)i,(char)(57-(x++)));
        for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch : s.toCharArray()) if(!l.contains(ch) && !l.contains(mirror.get(ch))) l.add(ch);
        for(int i=0;i<l.size();i++){
            sum += Math.abs(
    map.getOrDefault(l.get(i), 0) - 
    map.getOrDefault(mirror.get(l.get(i)), 0)
);
            //sum+=Math.abs(map.get(l.get(i))-map.get(mirror.get(l.get(i))));
        }
        return sum;
    }
}