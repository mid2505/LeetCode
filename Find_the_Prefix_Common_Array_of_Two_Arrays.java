// Problem: Find the Prefix Common Array of Two Arrays
// Language: java

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr = new int[A.length];
        for(int i=0;i<A.length;i++){
            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();
            for(int j=0;j<i+1;j++){
                s1.add(A[j]);
                s2.add(B[j]);
            }
            s1.retainAll(s2);
            arr[i] = s1.size();
        }
        return arr;
    }
}