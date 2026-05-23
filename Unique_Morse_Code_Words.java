// Problem: Unique Morse Code Words
// Language: java

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            StringBuilder x = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                x.append(s[(int)words[i].charAt(j)-97]);
            }
            map.put(x.toString(),0);
        }
        return map.size();
    }
}