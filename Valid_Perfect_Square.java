// Problem: Valid Perfect Square
// Language: java

class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.pow(num,0.5);
        System.out.println(x);
        return (x==(int)x);
    }
}