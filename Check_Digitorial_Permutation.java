// Problem: Check Digitorial Permutation
// Language: java

class Solution {
    public boolean isDigitorialPermutation(int n) {
        int t=n;
        int sum =0;
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        TreeMap<Integer,Integer> map2 = new TreeMap<>();
        while(n>0){
            sum+=fact(n%10);
            map1.put(n%10,map1.getOrDefault(n%10,0)+1);
            System.out.println(fact(n%10));
            n/=10;
        }
        while(sum>0){
            map2.put(sum%10,map2.getOrDefault(sum%10,0)+1);
            sum/=10;
        }
        System.out.println(map1);
        System.out.println(map2);
        return (map1.equals(map2));

    }
    public int fact(int n){
        if(n==0 || n==1) return 1;
        else return n*fact(n-1);
    }
}