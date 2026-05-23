// Problem: Find Unique Binary String
// Language: java

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> l = new ArrayList<>(); 
        for(String s : nums) l.add(s);
        int n1 = nums[0].length();
        int n = (int)Math.pow(2,n1)-1;
        for(int i=0;i<l.size()+1;i++){
            String t = padded(Integer.toBinaryString(n),n1);
            System.out.println(Integer.toBinaryString(n));
            if(!l.contains(t)) return t;
            n--;
        }
        return "";
    }
    public String padded(String t, int n){
        if(t.length()==n) return t;
        int x = n-t.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<x;i++){
            sb.append("0");
        }
        sb.append(t);
        System.out.println(sb.toString()+"--");
        return sb.toString();
    }
}