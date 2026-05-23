// Problem: Cells with Odd Values in a Matrix
// Language: java

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = 0;
            }
        }
        int r;
        int c;
        int mnx = 0;
        while(mnx < indices.length){
            r = indices[mnx][0];
            c = indices[mnx][1];
            for(int i=0;i<n;i++){
                mat[r][i]++;
            }
            for(int i=0;i<m;i++){
                mat[i][c]++;
            }
            mnx++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        return oddSum(m,n,mat);
    }
    public int oddSum(int m,int n,int[][] x){
        int c = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x[i][j]%2!=0){
                    c++;
                }
            }
        }
        return c;
    }
}