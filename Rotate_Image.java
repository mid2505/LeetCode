// Problem: Rotate Image
// Language: java

class Solution {
    public void rotate(int[][] m) {
        int[] arr = new int[m.length*m.length];
        int x=0;
        for(int i=0;i<m.length;i++){ 
            for(int j=0;j<m.length;j++){
                arr[x++] = m[i][j];
            }
        }
        int n=0;
        for(int i=m.length-1;i>=0;i--){ 
            for(int j=0;j<m.length;j++){
                m[j][i]=arr[n];
                n++;
            }
        }
    }
}