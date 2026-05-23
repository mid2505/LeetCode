// Problem: Shuffle String
// Language: java

class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder st = new StringBuilder();
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
                if(i==indices[j]) st.append(s.charAt(j));
            }
        }
        return st.toString();
    }
}