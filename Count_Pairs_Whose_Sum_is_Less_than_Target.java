// Problem: Count Pairs Whose Sum is Less than Target
// Language: java

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        int aunt = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]<target && i!=j) aunt++;
            }
        }
        return aunt/2;
    }
}