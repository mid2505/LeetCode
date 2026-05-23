// Problem: Matrix Diagonal Sum
// Language: java

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;

        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        int n = 0;
        for(int i=mat.length-1;i>=0;i--){
            sum+=mat[i][n];
            n++;
        }

        int x = mat.length/2;

        if(mat.length%2==0) return sum;
        else return sum-mat[x][x];
    }
}