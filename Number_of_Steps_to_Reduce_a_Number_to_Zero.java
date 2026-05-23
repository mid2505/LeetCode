// Problem: Number of Steps to Reduce a Number to Zero
// Language: java

class Solution {
    int steps = 0;
    public int numberOfSteps(int num) {
        if(num==0) return steps;
        steps++;
        if(num%2==0) numberOfSteps(num/2);
        else numberOfSteps(num-1);
        return steps;
    }
}