// Problem: Find the Degree of Each Vertex
// Language: java

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j : matrix[i]){
                if(j==1) arr[i]++;  
            }
        }
        return arr;
    }
}