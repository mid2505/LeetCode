// Problem: Kids With the Greatest Number of Candies
// Language: java

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int tar = Arrays.stream(candies).max().getAsInt();
        for(int can : candies){
            if(can+extraCandies>=tar) l.add(true);
            else l.add(false);
        }
        return l;
    }
}