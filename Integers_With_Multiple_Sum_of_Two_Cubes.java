// Problem: Integers With Multiple Sum of Two Cubes
// Language: java

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> l = new HashSet<>();

        int limit = (int)Math.cbrt(n);
        int[] cube = new int[limit+1];
        for(int i=1;i<=limit;i++) cube[i] = i*i*i;
        
        for(int i=1;i<=limit;i++){
            for(int j=i;j<=limit;j++){
                int sum = cube[i]+cube[j];
                if(ans.contains(sum) && sum<=n) l.add(sum);
                else if(sum<=n) ans.add(sum);
            }
        }
        List<Integer> fin = new ArrayList<>(l);
        Collections.sort(fin);
        return fin;
        
    }
}