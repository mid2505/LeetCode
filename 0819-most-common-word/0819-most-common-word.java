class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] strs = paragraph.toLowerCase().split("[^a-zA-Z]+");
        String ans = "";
        int max = 0;
        for(String s : strs){
            boolean flag = true;
            for(int i=0;i<banned.length;i++){
                if(s.equals(banned[i].toLowerCase())){
                    flag = false;
                    break;
                }
            }
            if(flag){ 
                map.put(s,map.getOrDefault(s,0)+1);
                if(map.get(s)>max){
                    max = map.get(s);
                    ans = s;
                }
            }
        }
        return ans;
    }
}