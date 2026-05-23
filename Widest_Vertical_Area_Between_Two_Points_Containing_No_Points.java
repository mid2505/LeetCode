// Problem: Widest Vertical Area Between Two Points Containing No Points
// Language: java

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        int[] arr = new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])>max){
                max = Math.abs(arr[i]-arr[i+1]);
            }
        }
        return max;
    }
}