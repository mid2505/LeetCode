// Problem: Available Captures for Rook
// Language: java

class Solution {
    public int numRookCaptures(char[][] board) {
        boolean flag1=false,flag2=false,flag3=false,flag4=false;
        int count = 0;
        int i=0,j=0;
        boolean f = false;
        for(i=0;i<board.length;i++){
            for(j=0;j<board[i].length;j++){
                if(board[i][j]=='R'){
                    f = true;
                    break;
                }
            }
            if(f) break;
        }
        int li=i,ui=i,ri=i,di=i;
        int lj=j,uj=j,rj=j,dj=j;
        while(true){
            if(flag1 && flag2 && flag3 && flag4) break;
            
            if(ui<0) flag1=true;
            if(di>=8) flag2=true;
            if(lj<0) flag3=true;
            if(rj>=8) flag4=true;

            if(ui>=0 && flag1!=true){
                if(board[ui][uj]=='p'){
                    flag1 = true;
                    count++;
                }
                else if(board[ui][uj]=='B'){
                    flag1 = true;
                }
                else{
                    ui--;
                }
            }
            if(di<board.length && flag2!=true){
                if(board[di][dj]=='p'){
                    flag2 = true;
                    count++;
                }
                else if(board[di][dj]=='B'){
                    flag2 = true;
                }
                else{
                    di++;
                }
            }
            if(lj>=0 && flag3!=true){
                if(board[li][lj]=='p'){
                    flag3 = true;
                    count++;
                }
                else if(board[li][lj]=='B'){
                    flag3 = true;
                }
                else{
                    lj--;
                }
            }
            if(rj<board.length && flag4!=true){
                if(board[ri][rj]=='p'){
                    flag4 = true;
                    count++;
                }
                else if(board[ri][rj]=='B'){
                    flag4 = true;
                }
                else{
                    rj++;
                }
            }
        }
        return count;
    }
}