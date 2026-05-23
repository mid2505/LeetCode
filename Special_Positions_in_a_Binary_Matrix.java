// Problem: Special Positions in a Binary Matrix
// Language: java

class Solution {
    public int numSpecial(int[][] mat) {
        int[] rowBitCount = new int[mat.length];
        int[] colBitCount = new int[mat[0].length];
        
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                rowBitCount[i] += mat[i][j];
                colBitCount[j] += mat[i][j];
            }  
            //System.out.println(rowBitCount[i]+"->"+colBitCount[i]);
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(rowBitCount[i]+colBitCount[j]==2 && mat[i][j]==1) count++;
            }
        }
        return count;
    }
}