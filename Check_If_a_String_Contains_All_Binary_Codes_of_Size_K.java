// Problem: Check If a String Contains All Binary Codes of Size K
// Language: java

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int j = 0;
        HashSet<String> st = new HashSet<>();
        for(int i=0;i+k<=s.length();i++){
            st.add(s.substring(i,i+k));
        }
        return st.size()== (int)Math.pow(2,k);
    }
}

/*
class House_garb{
    int m = 0;
    int p = 0;
    int g = 0;

    House_garb(String st){
        for(char ch : s.toCharArray()){
            if(ch=='M') m++;
            else if(ch=='P') p++;
            else g++;
        }
    }
}

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        House_grab[] h = new House_grab[garbage.length];

        int res = 0;
        for(int i=0;i<garbage.length;i++){
            h[i] = new House_garb(garbage[i]);
        }
        int i = 0;
        do{
            h[i].g;
        }
    }
} */