// Problem: Reverse String
// Language: java

class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while(low<s.length/2){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}