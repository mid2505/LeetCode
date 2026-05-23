// Problem: Number of Employees Who Met the Target
// Language: java

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cunt=0;
        for(int i:hours){
            if(i>=target) cunt++;
        }
        return cunt;
    }
}