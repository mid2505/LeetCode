// Problem: Construct Product Matrix
// Language: java

import java.math.BigInteger;
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        BigInteger all = new BigInteger("1");
        BigInteger val = new BigInteger("12345");
        int[][] prefixProd = new int[grid.length][grid[0].length];
        int[][] suffixProd = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                prefixProd[i][j] = Integer.valueOf(all+"");
                all = all.multiply(BigInteger.valueOf(grid[i][j])).mod(val);
            }
        }
        all = BigInteger.valueOf(1);
        //prefixProd[grid.length-1][grid[0].length-1] = 1;
        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
                suffixProd[i][j] = Integer.valueOf(all+"");
                all = all.multiply(BigInteger.valueOf(grid[i][j])).mod(val);
            }
        }
        int[][] p = new int[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                p[i][j] = (prefixProd[i][j]*suffixProd[i][j])%12345;
            }
        }
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[i].length;j++){
        //         p[i][j] = Integer.valueOf((all.divide(BigInteger.valueOf(grid[i][j]))).mod(BigInteger.valueOf(12345))+"");
        //     }
        // }
        return p;
    }
}