// Problem: Minimum Average of Smallest and Largest Elements
// Language: java

class Solution {
    public double minimumAverage(int[] nums) {
        List<Double> l = new ArrayList<Double>();
        for(int i=0;i<nums.length;i++){
            double d = nums[i];
            l.add(d);
        }
        double min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length/2;i++){
            double t1=(Collections.min(l));
            double t2=(Collections.max(l));
            l.remove(Collections.min(l));
            l.remove(Collections.max(l));
            if(min>((t1+t2)/2)){
                min = ((t1+t2)/2);
            }
        }
        return min;
    }
}