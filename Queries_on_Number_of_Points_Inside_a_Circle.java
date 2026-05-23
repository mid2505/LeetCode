// Problem: Queries on Number of Points Inside a Circle
// Language: java

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            arr[i]=0;
            for(int j=0;j<points.length;j++){
                if(calc(queries[i][0],queries[i][1],points[j][0],points[j][1])<=queries[i][2]){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
    public double calc(int x1, int y1, int x2, int y2){
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }
}