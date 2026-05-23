// Problem: Number of Laser Beams in a Bank
// Language: java

class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int temp = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') temp++;
            }
            if(temp!=0) l.add(temp);
        }   
        int ans=0; 
        for(int i=0;i<l.size()-1;i++){
            ans+=l.get(i)*l.get(i+1);
        }
        return ans;
    }
}