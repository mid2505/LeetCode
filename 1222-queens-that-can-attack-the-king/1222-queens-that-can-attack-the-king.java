class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int N = king[0];
        int S = king[0];
        int W = king[1];
        int E = king[1];
        int[] NW = {king[0],king[1]};
        int[] NE = {king[0],king[1]};
        int[] SW = {king[0],king[1]};
        int[] SE = {king[0],king[1]};
        while(N>=0){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==N && i[1]==king[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            N--;
        }
        while(S<8){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==S && i[1]==king[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            S++;
        }
        while(W>=0){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==king[0] && i[1]==W){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            W--;
        }
        while(E<8){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==king[0] && i[1]==E){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            E++;
        }
        while(NW[0]>=0 && NW[1]>=0){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==NW[0] && i[1]==NW[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            NW[0]--;
            NW[1]--;
        }
        while(NE[0]>=0 && NE[1]<8){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==NE[0] && i[1]==NE[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            NE[0]--;
            NE[1]++;
        }
        while(SW[0]<8 && SW[1]>=0){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==SW[0] && i[1]==SW[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            SW[0]++;
            SW[1]--;
        }
        while(SE[0]<8 && SE[1]<8){
            boolean flag = false;
            for(int[] i : queens){
                if(i[0]==SE[0] && i[1]==SE[1]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i[0]);
                    l.add(i[1]);
                    ans.add(l);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            SE[0]++;
            SE[1]++;
        }
        return ans;
    }
}