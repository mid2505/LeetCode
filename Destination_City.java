// Problem: Destination City
// Language: java

class Solution {
    public String destCity(List<List<String>> paths) {
        for(int i=0;i<paths.size();i++){
            boolean falg = true;
            for(int j=0;j<paths.size();j++){
                if(paths.get(i).get(1).equals(paths.get(j).get(0))){
                    falg = false;
                    break; 
                }
            }
            if(falg) return paths.get(i).get(1);
        }
        return "";
    }
}