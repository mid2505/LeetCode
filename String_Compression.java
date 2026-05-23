// Problem: String Compression
// Language: java

class Solution {
    public int compress(char[] chars) {
        int p = 0;
        int t = 0;
        int r = 0;
        char ptr = chars[p]; 
        for(int i=0;i<chars.length;i++){
            if(chars[i]==ptr) t++;
            else{
                chars[r++]=ptr;
                if(t!=1){
                    String s = t+"";
                    for(int j=0;j<s.length();j++){
                        chars[r++] = s.charAt(j);
                    }
                }
                ptr = chars[i];
                t=1;
            }
        }
        chars[r++]=ptr;
        if(t!=1){
            String s = t+"";
            for(int j=0;j<s.length();j++){
                chars[r++] = s.charAt(j);
            }
        }
        //for(int i=0;i<chars.length;i++) System.out.print(chars[i]+" ");
        return r;
    }
}