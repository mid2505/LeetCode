// Problem: Find Indices of Stable Mountains
// Language: java

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<height.length-1;i++){
            if(height[i]>threshold){
                l.add(i+1);
            }
        }
        return l;
    }
}