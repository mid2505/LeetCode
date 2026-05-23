// Problem: Permutation Difference between Two Strings
// Language: java

class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int temp = Math.abs(i-t.indexOf(s.charAt(i)));
            ans+=temp;
        }
        return ans;
    }
}