// Problem: Cells in a Range on an Excel Sheet
// Language: java

class Solution {
    public List<String> cellsInRange(String s) {
        String[] str = s.split(":");
        char sta = str[0].charAt(0);
        int stn = (int)str[0].charAt(1) - 48;
        char ena = str[1].charAt(0);
        int enn = (int)str[1].charAt(1) - 48;
        List<String> ans= new ArrayList<>();
        for(int i=(int)sta;i<=(int)ena;i++){
            for(int j=stn;j<=enn;j++){
                ans.add(""+(char)i+j);
            }
        }
        return ans;
    }
}