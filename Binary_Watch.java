// Problem: Binary Watch
// Language: java

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        if(turnedOn>8) return new ArrayList<>();
        
        List<String> l = new ArrayList<>();
        for(int hour = 0;hour<12;hour++){
            for(int minute = 0;minute<60;minute++){
                if(turnedOn == Integer.bitCount(hour)+Integer.bitCount(minute)){
                    String temp = minute<10?"0"+minute+"":minute+"";
                    l.add(hour+":"+temp);
                }
            }
        }
        return l;
    }
}