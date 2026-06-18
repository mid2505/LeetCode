class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        int x =0;
        for(char ch : order.toCharArray()) map.put(ch,x++);
        for(int i=0;i<words.length-1;i++){
            boolean flag = false;
            int len = Math.min(words[i].length(),words[i+1].length());
            for(int j=0;j<len;j++){
                if(map.get(words[i].charAt(j))>map.get(words[i+1].charAt(j))) return false;
                else if(map.get(words[i].charAt(j))==map.get(words[i+1].charAt(j))) continue;
                else{
                    flag = true;
                    break; 
                }
            }
            if(!flag){
                if(words[i].length()>words[i+1].length()) return false;
            }

        }
        return true;
    }
}