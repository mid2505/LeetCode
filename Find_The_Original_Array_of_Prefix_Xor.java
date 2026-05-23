// Problem: Find The Original Array of Prefix Xor
// Language: java

class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        int xor_sum_so_far = pref[0];
        List<Integer> sam = new ArrayList<Integer>();
        for(int i=0;i<pref.length;i++){
            sam.add(pref[i]);
        }
        int max = Collections.max(sam);
        if(max <=9) max = 9;
        List<Integer> l = new ArrayList<Integer>();
        l.add(pref[0]);
        for(int i=1;i<pref.length;i++){
            /*for(int j=0;j<=max;j++){
                if((temp ^ j)==pref[i]){
                    l.add(j);
                    break;
                }
            }*/
            int temp = (pref[i] ^ xor_sum_so_far);
            l.add(temp);
            xor_sum_so_far ^= temp;
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
    public int fixor(List<Integer> l){
        if(l.size() > 0){
            int ans = l.get(0);
            for(int i=1;i<l.size();i++){
                ans ^= l.get(i);
            }
            return ans;
        }
        return 0;
    }
}