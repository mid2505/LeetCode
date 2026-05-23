// Problem: Find The Least Frequent Digit
// Language: java

class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int t = n%10;
            map.put(t,map.getOrDefault(t,0)+1);
            n/=10;
        }
        int min = Integer.MAX_VALUE;
        int mink = Integer.MAX_VALUE;
        for(Map.Entry m:map.entrySet()){
            int i = (int)m.getKey();
            int j = (int)m.getValue();
            if(j<min){
                min = j;
                mink = i;        
            }
            else if(j==min){
                if(mink>i){
                    mink=i;
                }
            }
            else continue;
        }
        return mink;
    }
}