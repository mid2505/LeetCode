class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        long m = mass;
        // int st = -1;
        // for(int i=0;i<n;i++){
        //     if(mass<asteroids[i]){
        //         st = i;
        //         break;
        //     }
        // }
        // if(st==-1) return false;
        for(int i=0;i<n;i++){
            if(asteroids[i]>m) return false;
            m+=asteroids[i];
        }
        return true;
    }
}