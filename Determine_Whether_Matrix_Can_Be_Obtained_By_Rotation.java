// Problem: Determine Whether Matrix Can Be Obtained By Rotation
// Language: java

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(isSame(mat,target)) return true;

        for(int i=0;i<3;i++){
            mat = rotate(mat);
            if(isSame(mat,target)) return true;  
        }
        return false;
    }
    public int[][] rotate(int[][] mat){
        int[][] res = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            int n=mat[i].length;
            for(int j=0;j<mat[i].length;j++){
                res[n-1-j][i] = mat[i][j];
            }
        }
        return res;
    }
    public boolean isSame(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
}