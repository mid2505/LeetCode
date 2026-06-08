class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(e==a){
            for(int i=b;i>0;i--){
                if(i==d && a==c) break;
                if(i==f) return 1; 
            }
            for(int i=b;i<9;i++){
                if(i==d && a==c) break;
                if(i==f) return 1; 
            }
        }
        if(f==b){
            for(int i=a;i>0;i--){
                if(i==c && b==d) break;
                if(i==e) return 1; 
            }
            for(int i=a;i<9;i++){
                if(i==c && b==d) break;
                if(i==e) return 1; 
            }
        }

        int bishopColor = -1; //unknown
        int queenColor = -1;
        
        if(c%2==0){
            if(d%2==0){
                bishopColor = 1; // 1 - white
            }
            else bishopColor = 0; // 0 - black 
        }
        else{
            if(d%2==0){
                bishopColor = 0;
            }
            else bishopColor = 1;
        }

        if(e%2==0){
            if(f%2==0){
                queenColor = 1; // 1 - white
            }
            else queenColor = 0; // 0 - black 
        }
        else{
            if(f%2==0){
                queenColor = 0;
            }
            else queenColor = 1;
        }

        if(bishopColor == queenColor){

            System.out.println(bishopColor+" "+queenColor);
        int[] NW = {c,d};
        int[] NE = {c,d};
        int[] SW = {c,d};
        int[] SE = {c,d};

        while(NW[0]>0 && NW[1]>0){
            if(NW[0]==a && NW[1]==b) break;
            if(NW[0]==e && NW[1]==f) return 1;
            NW[0]--;
            NW[1]--;
        }
        while(NE[0]>0 && NE[1]<=8){
            if(NE[0]==a && NE[1]==b) break;
            if(NE[0]==e && NE[1]==f) return 1;
            NE[0]--;
            NE[1]++;
        }
        while(SW[0]<=8 && SW[1]>0){
            if(SW[0]==a && SW[1]==b) break;
            if(SW[0]==e && SW[1]==f) return 1;
            SW[0]++;
            SW[1]--;
        }
        while(SE[0]<=8 && SE[1]<=8){
            if(SE[0]==a && SE[1]==b) break;
            if(SE[0]==e && SE[1]==f) return 1;
            SE[0]++;
            SE[1]++;
        }
        }
        return 2;
    }
}