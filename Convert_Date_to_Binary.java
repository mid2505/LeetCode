// Problem: Convert Date to Binary
// Language: java

class Solution {
    public String convertDateToBinary(String date) {
        String[] d = date.split("-");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<d.length;i++){
            String temp = makebin(d[i]);
            ans.append(temp);
            if(i!=d.length-1) ans.append("-");
        }
        return ans.toString();
    }
    public String makebin(String str){
        int x = Integer.parseInt(str);
        StringBuilder s = new StringBuilder();
        while(x>0){
            int temp = x%2;
            s.append(temp);
            x/=2;
        }
        return s.reverse().toString();
    }
}