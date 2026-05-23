// Problem: Count Substrings That Satisfy K-Constraint I
// Language: java

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.println(s.substring(i,j+1));
                if(check(s.substring(i,j+1),k)) count++;
            }
        }
        return count;
    }

    public boolean check(String s, int k){
        int o = 0;
        int z = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') o++;
            else z++;
        }
        if(o>k && z>k) return false;
        return true;
    }
}