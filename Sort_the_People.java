// Problem: Sort the People
// Language: java

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      HashMap<Integer,String> map = new HashMap<>();
      for(int i=0;i<names.length;i++){
        map.put(heights[i],names[i]);
      }
      int[] arr = map.keySet().stream().sorted().mapToInt(Integer::intValue).toArray();
        String[] ans = new String[names.length];
      int x=0;
      for(int i=names.length-1;i>=0;i--){
        ans[x++] = map.get(arr[i]);
      }
      return ans;
    }
}