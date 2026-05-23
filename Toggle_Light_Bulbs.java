// Problem: Toggle Light Bulbs
// Language: java

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()%2==1) l.add(m.getKey());
        }
        Collections.sort(l);
        return l;
    }
}