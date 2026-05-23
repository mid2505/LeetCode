// Problem: Find the XOR of Numbers Which Appear Twice
// Language: java

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count =0;
        int ans=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()==2){
                count++;
                if(count==1){ans = m.getKey();}
                else ans^=m.getKey();
            }
        }
        return ans;
    }
}