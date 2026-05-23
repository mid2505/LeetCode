// Problem: Sort Integers by The Number of 1 Bits
// Language: java

class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            if(Integer.bitCount(arr[i])>Integer.bitCount(arr[i+1])){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=0;
                continue;
            }
            i++;
        }
        return arr;
    }
}