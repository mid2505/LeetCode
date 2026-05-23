// Problem: Check if the Sentence Is Pangram
// Language: java

class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> lis = new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            lis.add(sentence.charAt(i));
        }
        for(int i=97;i<97+26;i++){
            if(!lis.contains((char)i)) return false;
        }
        return true;
    }
}