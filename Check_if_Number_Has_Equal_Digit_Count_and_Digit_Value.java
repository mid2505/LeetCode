// Problem: Check if Number Has Equal Digit Count and Digit Value
// Language: java

class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length();i++){
            map.put(Integer.parseInt(num.charAt(i)+""), map.getOrDefault(Integer.parseInt(num.charAt(i)+""),0)+1);
        }
        for(int i=0;i<num.length();i++){
            if(map.containsKey(i)){
                if(map.get(i)!=Integer.parseInt(""+num.charAt(i))) return false;
            }
            else{
                if(num.charAt(i)!='0') return false;
            }
        }
        return true;
    }
}