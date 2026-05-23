// Problem: Angles of a Triangle
// Language: java

class Solution {
    public double[] internalAngles(int[] sides) {
        double[] angles = new double[3];
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        if((x+y)>z && (y+z)>x && (z+x)>y){
            angles[0] = Math.toDegrees(Math.acos(((x*x + y*y - z*z)/(2.0*x*y))));
            angles[1] = Math.toDegrees(Math.acos(((x*x + z*z - y*y)/(2.0*x*z))));
            angles[2] = 180.0 - angles[0] - angles[1];
            Arrays.sort(angles);
            return angles;
        }
        else{
            return new double[]{};
        }
    }
}