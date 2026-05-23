// Problem: Decode the Message
// Language: java

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder s = new StringBuilder();
        int x=97;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ') continue;
            if(!map.containsKey(key.charAt(i))) map.put(key.charAt(i),(char)(x++));
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' ') s.append(map.get(message.charAt(i)));
            else s.append(" ");
        }
        return s.toString();
    }
}