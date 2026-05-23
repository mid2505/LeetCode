// Problem: DI String Match
// Language: java

class Solution {
    public int[] diStringMatch(String s) {
        int st = 0;
        int end = s.length();
        int[] arr = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') arr[i] = (st++);
            else arr[i] = (end--);
        }
        if(s.charAt(s.length()-1)=='I'){
            arr[s.length()] = st;
        }
        else arr[s.length()] = end;
        return arr;
    }
}