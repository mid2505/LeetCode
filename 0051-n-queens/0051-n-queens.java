class Solution {
    List<List<String>> l = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        //build the board
        List<String> board = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(".");
        }
        for(int i=0;i<n;i++){
            board.add(sb.toString());
        }
        f(0,n,board);
        return l;
    }
    public void f(int idx, int n, List<String> board){
        if(idx>=n){
            l.add(new ArrayList<>(board)); // java sucks, it stupid strings are immutable, that's why i created a new arraylist, i hate it anyways.
            return;
        }
        for(int i=0;i<n;i++){
            if(canPlace(idx,i,board,n)){
                //in board, place Q on idx'th string's i'th index
                StringBuilder t = new StringBuilder(board.get(idx));
                t.setCharAt(i,'Q');
                board.set(idx,t.toString()); 
                f(idx+1,n,board);
                //in board, replace Q on idx's string's i'th index with "."
                t = new StringBuilder(board.get(idx));
                t.setCharAt(i,'.');
                board.set(idx,t.toString()); 
            }
        }
    }
    public boolean canPlace(int idx, int i, List<String> board,int n){
        int row = idx;
        int col = i;
        while(row>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
        }
        row = idx;
        col = i;
        while(row>=0 && col>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col--;
        }
        row = idx;
        col = i;
        while(row>=0 && col<n){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col++;
        }
        return true;
    }
}