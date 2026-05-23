// Problem: Third Maximum Number
// Language: java

class Solution {
    public int thirdMax(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            map.put(nums[i],0);
        }

        return map.size()>=3?getAns(map,false):getAns(map,true);
    }
    public int getAns(TreeMap<Integer,Integer> map,boolean isNotThree){
        int c = 0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            //System.out.println(m.getKey());
            if(isNotThree) return m.getKey();
            c++;
            if(c==3) return m.getKey();
        }
        return -1;
    }
}