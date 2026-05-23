// Problem: Minimum Number of Operations to Move All Balls to Each Box
// Language: java

class Solution {
    public int[] minOperations(String boxes) {
        StringBuilder s = new StringBuilder(boxes);
        int[] ans = new int[boxes.length()];
        for(int i=0;i<s.length();i++){
            ans[i]=move_to_me(s,i);
        }
        return ans;
    }
    public int move_to_me(StringBuilder s, int k){
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && k!=i){
                temp+=Math.abs(k-i);
            }
        }
        return temp;
    }
}