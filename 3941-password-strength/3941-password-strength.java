class Solution {
    public int passwordStrength(String password) {
        int strength = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : password.toCharArray()){
            if(sb.indexOf(ch+"")!=-1) continue;
            else{
                int ascii = (int)ch;
                if(ascii>=65 && ascii<=90) strength+=2;
                else if(ascii>=97 && ascii<=122) strength+=1;
                else if(ascii>=48 && ascii<=57) strength+=3;
                else if("!@#$".indexOf(ch+"")!=-1) strength+=5;
                sb.append(ch+"");
            }
        }
        return strength;
    }
}