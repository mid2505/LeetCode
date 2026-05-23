// Problem: Goal Parser Interpretation
// Language: java

class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                s.append("G");
                flag = false;
            }
            else if(command.charAt(i)=='('){
                flag = true;
            }
            else if(flag){
                if(command.charAt(i)==')'){
                    flag = false;
                    s.append("o");
                }
                else{
                    flag = false;
                    s.append("al");
                    i+=2;
                }
            }
            else{
                continue;
            }
        }
        return s.toString();
    }
}