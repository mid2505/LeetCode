// Problem: Merge Adjacent Equal Elements
// Language: java

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int i=0;
        List<Long> l = new ArrayList<>();
        for(i = 0;i<nums.length;i++){
            l.add((long)nums[i]);
        }
        i = 0;
        while(i<l.size()-1){
            if(l.get(i).equals(l.get(i+1))){
                l.set(i,(l.get(i)+l.get(i+1)));
                l.remove(i+1);
                if(i>0) i--;
                else i=0;
            }
            else i++;
        }
        return l;
    }
}