// Problem: Find Lucky Integer in an Array
// Language: java

class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp++;
                }
            }
            if(arr[i]==temp){
                if(arr[i]>ans){
                    ans=arr[i];
                }
            }
        }
        return ans;
    }
}