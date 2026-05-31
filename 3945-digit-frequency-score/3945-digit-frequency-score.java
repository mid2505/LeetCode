class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int t = n%10;
            map.put(t,map.getOrDefault(t,0)+1);
            n/=10;
        }
        int score = 0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            score+=m.getKey()*m.getValue();
        }
        return score;
    }
}