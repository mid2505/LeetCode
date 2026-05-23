// Problem: Reverse Integer
// Language: java

class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder(""+Math.abs(x));
        s.reverse();
        int te;
        try{
            te = Integer.parseInt(s.toString());
        }
        catch(Exception e){
            return 0;
        }
        if(x<0){
            return -(te);
        }
        return te;
    }
}