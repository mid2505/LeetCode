class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int[] chr = new int[9];
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int t = board[i][j]-'1';
                chr[t]++;
                if(chr[t]>1) return false;
            }
        }
        for(int i=0;i<9;i++){
            int[] chr = new int[9];
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                int t = board[j][i]-'1';
                chr[t]++;
                if(chr[t]>1) return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(validateGrid(board,i,j)) return false;
            }
        }
        return true;
    }
    public boolean validateGrid(char[][] board, int r, int c){
        int[] chr = new int[9];
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]=='.') continue;
                chr[board[i][j]-'1']++;
                if(chr[board[i][j]-'1']>1) return true;
            }
        }
        return false;
    }
}