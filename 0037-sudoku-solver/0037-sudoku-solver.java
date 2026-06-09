class Solution {
    public void solveSudoku(char[][] board) {
        f(board);
    }
    public boolean f(char[][] board){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.'){
                    for(int k = 0;k<9;k++){
                        if(canPlace(i,j,k,board)){
                            board[i][j] = (char)(k+49);
                            if(f(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean canPlace(int i_idx, int j_idx, int k, char[][] board){
        for(int i=0;i<9;i++){
            if(board[i_idx][i] == (char)(k+49)) return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][j_idx] == (char)(k+49)) return false;
        }
        if(i_idx<3 && j_idx<3){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<3 && j_idx<6){
            for(int i=0;i<3;i++){
                for(int j=3;j<6;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<3 && j_idx<9){
            for(int i=0;i<3;i++){
                for(int j=6;j<9;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<6 && j_idx<3){
            for(int i=3;i<6;i++){
                for(int j=0;j<3;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<6 && j_idx<6){
            for(int i=3;i<6;i++){
                for(int j=3;j<6;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<6 && j_idx<9){
            for(int i=3;i<6;i++){
                for(int j=6;j<9;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<9 && j_idx<3){
            for(int i=6;i<9;i++){
                for(int j=0;j<3;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<9 && j_idx<6){
            for(int i=6;i<9;i++){
                for(int j=3;j<6;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        else if(i_idx<9 && j_idx<9){
            for(int i=6;i<9;i++){
                for(int j=6;j<9;j++){
                    if(board[i][j]==(char)(k+49)) return false;
                }
            }
        }
        return true;
    }
}