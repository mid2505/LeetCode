class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int x = 0;
        for(int i=0;i<n;i++){
            if(x<spaces.length && i==spaces[x]){
                sb.append(" ");
                x++;
                sb.append(s.charAt(i));
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}