// Problem: Group the People Given the Group Size They Belong To
// Language: java

class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        for(int i=0;i<g.length;i++){
            if(!l.contains(g[i])) l.add(g[i]);
        }
        for(int i=0;i<l.size();i++){
            int temp = 0;
            for(int j=0;j<g.length;j++){
                if(l.get(i) == g[j]) temp++;
            }
            if(temp>l.get(i)){
                int x1 = temp/l.get(i);
                for(int x = 0;x<x1;x++){
                    l1.add(l.get(i));
                }
            }
            else{
                l1.add(l.get(i));
            }
        }
        System.out.println(l1);
        
        for(int i=0;i<l1.size();i++){
            List<Integer> temp = new ArrayList<Integer>();
            int t1 = 0;
            for(int j=0;j<g.length;j++){
                if(l1.get(i)==t1){
                    break;
                }
                if(g[j] == l1.get(i) && !l2.contains(j)){
                    temp.add(j);
                    l2.add(j);
                    t1++;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}