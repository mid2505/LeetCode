// Problem: Generate a String With Characters That Have Odd Counts
// Language: java

class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        if(n%2!=0){
            for(int i=0;i<n;i++){
                s.append('a'+"");
            }
        }
        else{
            for(int i=0;i<n-1;i++){
                s.append('a'+"");
            }
            s.append('b'+"");
        }
        return s.toString();    
    }
}