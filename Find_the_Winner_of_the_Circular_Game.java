// Problem: Find the Winner of the Circular Game
// Language: java

class Solution {
    int cur = 0;
    public int findTheWinner(int n, int k) {
        k--;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(i+1);
        }
        while(l.size()!=1){
            cur = (cur+k)%l.size();
            System.out.println("going to be removed -> "+(cur));
            l.remove(cur);
        }
        return l.get(0);
    }
}