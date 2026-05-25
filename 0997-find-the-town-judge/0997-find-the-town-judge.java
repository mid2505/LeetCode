class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        List<Integer> l = new ArrayList<>();
        int[] arr = new int[n+1];
        for(int i=0;i<trust.length;i++){
            arr[trust[i][1]]++;
            if(arr[trust[i][1]]==(n-1)) l.add(i);
        }
        boolean flag = false;
        for(int i=0;i<l.size();i++){
            int temp = l.get(i);
            flag = false;
            for(int[] j:trust){
                if(j[0]==trust[temp][1]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) return trust[temp][1];
        }
        
        //for(int i=0;i<l.size();i++) System.out.print(l.get(i)+" ");
        return -1;
    }
}