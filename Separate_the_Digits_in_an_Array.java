// Problem: Separate the Digits in an Array
// Language: java

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
            StringBuilder s = new StringBuilder(""+i);
            for(char ch : s.toString().toCharArray()){
                l.add(Integer.parseInt(""+ch));
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}