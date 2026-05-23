// Problem: Merge Similar Items
// Language: java

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],map.getOrDefault(items1[i][0],0)+items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            map.put(items2[i][0],map.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(entry -> Arrays.asList(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
}