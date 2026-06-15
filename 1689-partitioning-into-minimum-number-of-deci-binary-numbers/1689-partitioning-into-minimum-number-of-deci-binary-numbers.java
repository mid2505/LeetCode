class Solution {
    public int minPartitions(String n) {
        int val = 0;
        for(char ch : n.toCharArray()) val = Math.max(val,ch-'0');
        return val;
    }
}