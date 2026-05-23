// Problem: Minimum Number of Chairs in a Waiting Room
// Language: java

class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int chair = 0;
        for(char ch : s.toCharArray()){
            if(ch=='E') chair++;
            else chair--;
            if(chair>max) max = chair;
        }
        return max;
    }
}