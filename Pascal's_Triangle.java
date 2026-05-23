// Problem: Pascal's Triangle
// Language: java

class Solution {
    int c = 1;
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        l.add(temp);
        for(int i=2;i<=numRows;i++){
            temp = new ArrayList<>();
            List<Integer> old = l.get(i-2);
            temp.add(1);
            for(int j=0;j<old.size()-1;j++){
                temp.add(old.get(j)+old.get(j+1));
            }
            temp.add(1);
            l.add(temp);
        }
        return l;
    }
}