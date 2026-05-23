// Problem: Find Kth Bit in Nth Binary String
// Language: java

class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        while(n>=1){
            //System.out.println(s.toString()+"->"+n);
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<s.length();i++){
                temp.append(s.charAt(i)=='1'?'0':'1');
            }
            temp.reverse();
            s.append(1+"");
            s.append(temp.toString());
            n--;
            //System.out.println(s.toString()+"->"+n);
        }
        //System.out.println(s.toString()+"->"+n);
        return s.charAt(k-1);
    }
}