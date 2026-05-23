// Problem: Reverse Bits
// Language: java

class Solution {
    public int reverseBits(int n) {
        StringBuilder s = new StringBuilder(Integer.toBinaryString(n)+"");
        
        s.reverse();
        if(s.length()<32){
            for(int i=s.length()-1;i<32;i++){
                s.append('0'+"");
            }
        }
        System.out.println(s.toString());
        return binaryToInteger(s.toString());
    }
    public int binaryToInteger(String s){
        int ans = 0;
        int x = 0;
        for(int i = 31;i>=0;i--){
            ans+=Integer.parseInt(s.charAt(i)+"")*Math.pow(2,x++);
        }
        return ans;
    }
}