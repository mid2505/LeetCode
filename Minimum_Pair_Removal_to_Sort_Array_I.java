// Problem: Minimum Pair Removal to Sort Array I
// Language: java

class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums) l.add(i);
        int count = 0;
        if(isSorted(l)) return 0;
        while(!isSorted(l)){
            int min = Integer.MAX_VALUE;
            int mina_idx = -1;
            int minb_idx = -1;

            for(int i=0;i<l.size()-1;i++){
                if(min>l.get(i)+l.get(i+1)){
                    min = l.get(i)+l.get(i+1);
                    mina_idx = i;
                    minb_idx = i+1;
                }
            }

            l.remove(mina_idx);
            l.remove(minb_idx-1);
            l.add(mina_idx,min);
            count++;
        }
        return count;
    }
    public boolean isSorted(List l){
        for(int i = 0;i<l.size()-1;i++){
            if((int)l.get(i) > (int)l.get(i+1)) return false;
        }
        return true;
    }
}