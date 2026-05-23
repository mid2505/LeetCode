// Problem: Find Missing and Repeated Values
// Language: java

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> l = new ArrayList<>();
        int[] arr = new int[2];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(l.contains(grid[i][j])) arr[0] = grid[i][j];
                else {
                    l.add(grid[i][j]);
                    sum+=grid[i][j];
                }
            }
        }
        int x = grid.length*grid.length;
        arr[1] = (x*(x+1))/2 - sum;
        return arr;
    }
}