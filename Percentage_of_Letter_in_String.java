// Problem: Percentage of Letter in String
// Language: java

class Solution {
    public int percentageLetter(String s, char letter) {
        int ans = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            
            if((ch+"").equals(letter+"")){
                
                count++;
            }
        }
        System.out.println(count);
        ans = count*100/s.length();
        return ans;
    }
}