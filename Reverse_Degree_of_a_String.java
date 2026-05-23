// Problem: Reverse Degree of a String
// Language: java

class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ind = 26;
        for(int i=97;i<97+26;i++){
            map.put((char)i,ind--);
        }
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int temp = map.get(s.charAt(i));
            int temp1 = temp*(i+1);
            ans+=temp1;
        }
        return ans;
    }
}