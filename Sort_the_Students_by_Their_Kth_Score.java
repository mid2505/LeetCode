// Problem: Sort the Students by Their Kth Score
// Language: java

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<Integer> l = new ArrayList<>();
        System.out.println(score.length);
        for(int i=0;i<score.length;i++){
            l.add(score[i][k]);
        }
        int temp;
        int[][] ans = new int[score.length][score[0].length];
        for(int i=0;i<score.length;i++){
            temp = l.indexOf(Collections.max(l));
            for(int j=0;j<score[i].length;j++){
                ans[i][j] = score[temp][j];
            }
            l.set(temp,0);    
        }
        return ans;
    }
}