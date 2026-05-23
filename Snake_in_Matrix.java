// Problem: Snake in Matrix
// Language: java

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        //n--;
        int init=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                init++;
                //System.out.println("hello");
            }
            else if(commands.get(i).equals("LEFT")){
                init--;
            }
            else if(commands.get(i).equals("UP")){
                init-=n;
            }
            else if(commands.get(i).equals("DOWN")){
                init+=n;
            }
            else continue;
        }
        return init;
    }
}