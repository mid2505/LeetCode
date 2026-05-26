class Solution {
    public int numberOfSpecialChars(String word) {
        // HashMap<Character,Integer> map = new HashMap<>();
        
        // for(char ch : word.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(Map.Entry<Character,Integer> m : map.entrySet()){
        //     char ch = m.getKey();
        //     if((int)ch >=65 && (int)ch <= 90){
        //         if(map.get(Character.tolowerCase(ch))!=null)
        //     }
        // }
        int[] arr = new int[26];
        for(char ch : word.toCharArray()){
            int t = (int)ch;
            if(t>=65 && t<=90){
                if(arr[ch-'A']==0) arr[ch-'A']++;
            }
        }
        int ans = 0;
        for(char ch : word.toCharArray()){
            int t = (int)ch;
            if(t>=97 && t<=122){
                if(arr[ch-'a']==1){
                    arr[ch-'a']++;
                    ans++;
                }
            }
        }
        return ans;
    }
}