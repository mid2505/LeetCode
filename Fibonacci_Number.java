// Problem: Fibonacci Number
// Language: java

class Solution {
    public int fib(int n) {
        if(n<2) return n==0?0:1;
        else return fib(n-2)+fib(n-1);
    }
}